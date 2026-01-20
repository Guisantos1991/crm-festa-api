package com.guidev.festacrm.dto;

import com.guidev.festacrm.entity.enums.ExpenseCategory;
import com.guidev.festacrm.entity.enums.TransactionType;
import java.time.LocalDate;


public record TransactionDto(TransactionType type,
                             ExpenseCategory expenseCategory,
                             String customCategory,
                             Double amount,
                             LocalDate date,
                             String description) {

}
