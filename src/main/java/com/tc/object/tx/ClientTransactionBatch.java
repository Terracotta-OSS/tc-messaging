/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.tx;

import com.tc.object.tx.ClientTransactionBatchWriter.FoldedInfo;
import com.tc.util.SequenceGenerator;
import com.tc.util.SequenceID;

import java.util.Collection;

/**
 * Client representation of a batch of transactions. Has methods that are only useful in a client context.
 */
public interface ClientTransactionBatch extends TransactionBatch {

  public TxnBatchID getTransactionBatchID();

  /**
   * Adds the collection of transaction ids in this batch to the given collection and returns it.
   */
  public Collection<TransactionID> addTransactionIDsTo(Collection<TransactionID> c);

  /**
   * Add the given transaction to this batch.
   * 
   * @param txn
   * @param sequenceGenerator
   * @param transactionIDGenerator
   * @return true if the transaction was folded
   */
  public FoldedInfo addTransaction(ClientTransaction txn, SequenceGenerator sequenceGenerator,
                                   TransactionIDGenerator transactionIDGenerator);
  
  public TransactionBuffer addSimpleTransaction(ClientTransaction txn);

  public TransactionBuffer removeTransaction(TransactionID txID);
  
  public boolean contains(TransactionID txID);
    
  /**
   * Send the transaction to the server.
   */
  public void send();

  public int numberOfTxnsBeforeFolding();

  public int byteSize();

  public boolean isNull();

  public SequenceID getMinTransactionSequence();

  public Collection<SequenceID> addTransactionSequenceIDsTo(Collection<SequenceID> sequenceIDs);
  
  // For testing
  public String dump();

}
