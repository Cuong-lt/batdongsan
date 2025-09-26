package com.javaweb.batdongsan.entity.customer;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum DemandType {
    RENT_OFFICE("Rent Office"),
    SELL_OFFICE("Sell Office"),
    RENT_APARTMENT("Rent Apartment"),
    SELL_APARTMENT("Sell Apartment")
    ;

    String value;
}
