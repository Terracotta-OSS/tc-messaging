/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.msg;

import com.tc.net.GroupID;
import com.tc.object.ServerMapRequestID;

public interface GetAllSizeServerMapResponseMessage extends ServerMapResponseMessage {

  public ServerMapRequestID getRequestID();

  public Long getSize();

  public GroupID getGroupID();

  public void initializeGetAllSizeResponse(GroupID groupID, ServerMapRequestID requestID, Long size);

}
