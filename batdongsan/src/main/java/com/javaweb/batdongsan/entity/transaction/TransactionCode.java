package com.javaweb.batdongsan.entity.transaction;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum TransactionCode {
    LEAD("Lead"),
    MEETING("Meeting"),
    CONTACT("Contact");

    String value;
}
