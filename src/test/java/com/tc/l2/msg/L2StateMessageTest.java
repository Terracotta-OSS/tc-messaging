/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.l2.msg;

import com.tc.io.TCByteBufferInputStream;
import com.tc.io.TCByteBufferOutputStream;
import com.tc.l2.state.Enrollment;
import com.tc.net.ServerID;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L2StateMessageTest {

  private Enrollment     enrollment;
  private L2StateMessage l2StateMessage;

  @Before
  public void setUp() {
    enrollment = new Enrollment(new ServerID("30001", new byte[] { 54, -125, 34, -4 }), true, new long[] {0, 1});
    l2StateMessage = new L2StateMessage();
  }

  @After
  public void tearDown() {
    enrollment = null;
    l2StateMessage = null;
  }

  private void validate(L2StateMessage l2sm, L2StateMessage l2sm1) {
    assertEquals(l2sm.getType(), l2sm1.getType());
    assertEquals(l2sm.getMessageID(), l2sm1.getMessageID());
    assertEquals(l2sm.inResponseTo(), l2sm1.inResponseTo());
    assertEquals(l2sm.messageFrom(), l2sm1.messageFrom());

    assertEquals(l2sm.getEnrollment(), l2sm1.getEnrollment());
    assertEquals(l2sm.toString(), l2sm1.toString());
  }

  private L2StateMessage writeAndRead(L2StateMessage l2sm) throws Exception {
    TCByteBufferOutputStream bo = new TCByteBufferOutputStream();
    l2sm.serializeTo(bo);
    System.err.println("Written : " + l2sm);
    TCByteBufferInputStream bi = new TCByteBufferInputStream(bo.toArray());
    L2StateMessage l2sm1 = new L2StateMessage();
    l2sm1.deserializeFrom(bi);
    System.err.println("Read : " + l2sm1);
    return l2sm1;
  }

  @Test
  public void testBasicSerialization() throws Exception {
    L2StateMessage l2sm = (L2StateMessage) L2StateMessage.createElectionStartedMessage(enrollment);
    L2StateMessage l2sm1 = writeAndRead(l2sm);
    validate(l2sm, l2sm1);

    l2sm = (L2StateMessage) L2StateMessage.createElectionResultMessage(enrollment);
    l2sm1 = writeAndRead(l2sm);
    validate(l2sm, l2sm1);

    l2sm = (L2StateMessage) L2StateMessage.createElectionWonMessage(enrollment);
    l2sm1 = writeAndRead(l2sm);
    validate(l2sm, l2sm1);

    l2sm = (L2StateMessage) L2StateMessage.createMoveToPassiveStandbyMessage(enrollment);
    l2sm1 = writeAndRead(l2sm);
    validate(l2sm, l2sm1);

    l2sm = (L2StateMessage) L2StateMessage.createAbortElectionMessage(l2StateMessage, enrollment);
    l2sm1 = writeAndRead(l2sm);
    validate(l2sm, l2sm1);

    l2sm = (L2StateMessage) L2StateMessage.createElectionStartedMessage(l2StateMessage, enrollment);
    l2sm1 = writeAndRead(l2sm);
    validate(l2sm, l2sm1);

    l2sm = (L2StateMessage) L2StateMessage.createResultConflictMessage(l2StateMessage, enrollment);
    l2sm1 = writeAndRead(l2sm);
    validate(l2sm, l2sm1);

    l2sm = (L2StateMessage) L2StateMessage.createResultAgreedMessage(l2StateMessage, enrollment);
    l2sm1 = writeAndRead(l2sm);
    validate(l2sm, l2sm1);
  }

}
