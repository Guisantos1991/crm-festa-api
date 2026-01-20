package com.guidev.festacrm.repository;

import com.guidev.festacrm.entity.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction, String> {

}
