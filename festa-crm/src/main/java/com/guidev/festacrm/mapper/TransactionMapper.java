package com.guidev.festacrm.mapper;

import com.guidev.festacrm.dto.TransactionDto;
import com.guidev.festacrm.entity.Transaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

    Transaction toEntity(TransactionDto transactionDto);
    TransactionDto toDto(Transaction transaction);

}
