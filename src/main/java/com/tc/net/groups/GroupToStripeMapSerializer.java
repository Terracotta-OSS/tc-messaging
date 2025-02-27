/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.net.groups;

import com.tc.io.TCByteBufferInput;
import com.tc.io.TCByteBufferOutput;
import com.tc.io.TCSerializable;
import com.tc.net.GroupID;
import com.tc.net.StripeID;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * helper class to hide the serialization and de-serialization of Map&lt;GroupID, StripeID&gt; implementations from external
 * world.
 */
public class GroupToStripeMapSerializer implements TCSerializable {

  private final Map<GroupID, StripeID> groupToStripeMap;

  public GroupToStripeMapSerializer() {
    groupToStripeMap = new HashMap<GroupID, StripeID>();
  }

  public GroupToStripeMapSerializer(Map groupToStripeMap) {
    this.groupToStripeMap = groupToStripeMap;
  }

  public Map<GroupID, StripeID> getMap() {
    return groupToStripeMap;
  }

  @Override
  public Object deserializeFrom(TCByteBufferInput serialInput) throws IOException {
    int size = serialInput.readInt();
    for (int i = 0; i < size; ++i) {
      NodeIDSerializer nodeIDSerializer = new NodeIDSerializer();
      nodeIDSerializer.deserializeFrom(serialInput);
      GroupID gid = (GroupID) nodeIDSerializer.getNodeID();

      nodeIDSerializer = new NodeIDSerializer();
      nodeIDSerializer.deserializeFrom(serialInput);
      StripeID stripeID = (StripeID) nodeIDSerializer.getNodeID();
      groupToStripeMap.put(gid, stripeID);
    }
    return this;
  }

  @Override
  public void serializeTo(TCByteBufferOutput serialOutput) {
    serialOutput.writeInt(groupToStripeMap.size());
    for (Map.Entry<GroupID, StripeID> entry : groupToStripeMap.entrySet()) {
      new NodeIDSerializer(entry.getKey()).serializeTo(serialOutput);
      new NodeIDSerializer(entry.getValue()).serializeTo(serialOutput);
    }
  }

}
