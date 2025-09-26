package com.javaweb.batdongsan.entity.building;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum BuildingType {
    OFFICE("Văn phòng"),
    APARTMENT("Căn hộ"),
    HOUSE("Nhà ở"),
    SHOP("Cửa hàng"),
    WAREHOUSE("Kho"),
    FACTORY("Nhà máy"),
    OTHER("Khác");

    String value;
}
