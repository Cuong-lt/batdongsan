package com.javaweb.batdongsan.entity.building;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum BuildingStatus {
    AVAILABLE("Available"),
    RENTED("Rented"),
    UNDER_MAINTENANCE("Under Maintenance"),
    CLOSED("Closed");

    String value;
}
