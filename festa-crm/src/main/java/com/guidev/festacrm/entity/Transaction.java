package com.guidev.festacrm.entity;

import com.guidev.festacrm.entity.enums.TransactionType;
import com.guidev.festacrm.entity.enums.ExpenseCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "transactions")
public class Transaction {

    @Id
    private String id;

    private TransactionType type;

    private ExpenseCategory expenseCategory;

    private String customCategory;

    private Double amount;
    private LocalDate date;
    private String description;

    @CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;


}
