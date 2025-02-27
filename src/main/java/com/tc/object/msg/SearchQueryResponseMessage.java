/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.net.protocol.tcm.TCMessage;
import com.terracottatech.search.aggregator.Aggregator;

import java.util.List;

/**
 * Response message for object requests.
 * 
 * @author Nabib El-Rahman
 */
public interface SearchQueryResponseMessage extends TCMessage, SearchResponseMessage {

  /**
   * @return List&lt;NVPair&gt; aggregator results.
   */
  public List<Aggregator> getAggregators();

  public boolean isAnyCriteriaMatched();

  public boolean isQueryGroupBy();

  /**
   * Not necessarily the same as size of {@link #getResults()} list, if results were paginated.
   */
  public long getTotalResultCount();

}
