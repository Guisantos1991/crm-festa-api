package com.guidev.festacrm.controller;

import com.guidev.festacrm.dto.TransactionDto;
import com.guidev.festacrm.entity.Transaction;
import com.guidev.festacrm.repository.TransactionRepository;
import com.guidev.festacrm.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apifesta")
public class TransactionController {

    private final TransactionRepository transactionRepository;
    private final TransactionService transactionService;

    public TransactionController(TransactionRepository transactionRepository, TransactionService transactionService) {
        this.transactionRepository = transactionRepository;
        this.transactionService = transactionService;
    }

    @GetMapping
    public List<Transaction> getTransactions() {
        return transactionRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Transaction> saveTransaction(@Valid @RequestBody TransactionDto transactionDto) {
        Transaction saved = transactionService.createTransaction(transactionDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllTransactions() {
        transactionRepository.deleteAll();
        return ResponseEntity.ok().body("Todos os arquivos foram removidos");
    }
}
