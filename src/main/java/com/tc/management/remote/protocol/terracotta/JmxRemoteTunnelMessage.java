/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.management.remote.protocol.terracotta;

import com.tc.bytes.TCByteBuffer;
import com.tc.exception.TCRuntimeException;
import com.tc.io.TCByteBufferInput;
import com.tc.io.TCByteBufferOutput;
import com.tc.io.TCByteBufferOutputStream;
import com.tc.io.TCSerializable;
import com.tc.net.protocol.tcm.MessageChannel;
import com.tc.net.protocol.tcm.MessageMonitor;
import com.tc.net.protocol.tcm.TCMessageHeader;
import com.tc.net.protocol.tcm.TCMessageType;
import com.tc.object.msg.DSOMessageBase;
import com.tc.object.session.SessionID;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class JmxRemoteTunnelMessage extends DSOMessageBase implements TCSerializable {

  private static final byte TUNNEL_MESSAGE = 0;
  private static final byte FLAG           = 1;

  private static final byte SYN_FLAG       = 1 << 0;
  private static final byte DATA_FLAG      = 1 << 1;
  private static final byte FIN_FLAG       = 1 << 2;

  private Object            tunneledMessage;
  private byte              flag;

  public JmxRemoteTunnelMessage(SessionID sessionID, MessageMonitor monitor, TCByteBufferOutputStream out,
                                MessageChannel channel, TCMessageType type) {
    super(sessionID, monitor, out, channel, type);
    flag = DATA_FLAG;
  }

  public JmxRemoteTunnelMessage(SessionID sessionID, MessageMonitor monitor, MessageChannel channel,
                                TCMessageHeader header, TCByteBuffer[] data) {
    super(sessionID, monitor, channel, header, data);
    flag = DATA_FLAG;
  }

  @Override
  protected boolean hydrateValue(final byte name) throws IOException {
    switch (name) {
      case TUNNEL_MESSAGE:
        setTunneledMessage(getObject(this));
        return true;
      case FLAG:
        setFlag(getByteValue());
        return true;
      default:
        return false;
    }
  }

  @Override
  protected void dehydrateValues() {
    putNVPair(FLAG, flag);
    putNVPair(TUNNEL_MESSAGE, this);
  }

  @Override
  public synchronized void serializeTo(TCByteBufferOutput serialOutput) {
    try {
      final ByteArrayOutputStream bao = new ByteArrayOutputStream(1024);
      final ObjectOutputStream oos = new ObjectOutputStream(bao);
      oos.writeObject(tunneledMessage);
      oos.close();

      final byte serializedObject[] = bao.toByteArray();
      serialOutput.writeByte(flag);
      serialOutput.writeInt(serializedObject.length);
      serialOutput.write(serializedObject);
    } catch (IOException ioe) {
      throw new TCRuntimeException(ioe);
    }
  }

  @Override
  public synchronized Object deserializeFrom(TCByteBufferInput serialInput) throws IOException {
    try {
      flag = serialInput.readByte();
      final int length = serialInput.readInt();
      final byte serializedObject[] = new byte[length];
      serialInput.read(serializedObject);
      final ByteArrayInputStream bis = new ByteArrayInputStream(serializedObject);
      final ObjectInputStream ois = new ObjectInputStream(bis);
      return ois.readObject();
    } catch (ClassNotFoundException cnfe) {
      throw new TCRuntimeException(cnfe);
    }
  }

  protected synchronized void setInitConnection() {
    setFlag(SYN_FLAG);
  }

  synchronized boolean getInitConnection() {
    return flag == SYN_FLAG;
  }

  synchronized void setCloseConnection() {
    setFlag(FIN_FLAG);
  }

  synchronized boolean getCloseConnection() {
    return flag == FIN_FLAG;
  }

  synchronized void setTunneledMessage(final Object tunneledMessage) {
    this.tunneledMessage = tunneledMessage;
  }

  synchronized Object getTunneledMessage() {
    return tunneledMessage;
  }

  private synchronized void setFlag(final byte flag) {
    this.flag = flag;
  }

}
