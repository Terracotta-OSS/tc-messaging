/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.msg;

import com.tc.net.NodeID;

public interface SearchRequestMessageFactory {

  SearchQueryRequestMessage newSearchQueryRequestMessage(final NodeID nodeID);
  
  SearchResultsRequestMessage newSearchResultsRequestMessage(final NodeID nodeID);
}
