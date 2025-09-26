package com.javaweb.batdongsan.entity.customer;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum CustomerStatus {
    ACTIVE("Active"),
    INACTIVE("Inactive");

    String value;
}
