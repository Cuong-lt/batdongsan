package com.javaweb.batdongsan.entity.contract;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ContractStatus {
    DRAFT("Draft"),
    ACTIVE("Active"),
    EXPIRED("Expired"),
    TERMINATED("Terminated");

    String value;
}
