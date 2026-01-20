package com.guidev.festacrm.service;

import com.guidev.festacrm.dto.TransactionDto;
import com.guidev.festacrm.entity.Transaction;
import com.guidev.festacrm.mapper.TransactionMapper;
import com.guidev.festacrm.repository.TransactionRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;

    private final TransactionMapper transactionMapper;

    public Transaction createTransaction(TransactionDto transactionDto) {
        if (transactionDto == null) {
            throw new IllegalArgumentException("Favor enviar uma transação válida.");
        }
        Transaction transaction = transactionMapper.toEntity(transactionDto);

        transactionRepository.save(transaction);
        log.info("Transação salva com sucesso: {}", transaction);
        return transaction;
    }

}
