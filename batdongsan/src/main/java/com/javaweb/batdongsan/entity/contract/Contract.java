package com.javaweb.batdongsan.entity.contract;

import com.javaweb.batdongsan.entity.BaseEntity;
import com.javaweb.batdongsan.entity.User;
import com.javaweb.batdongsan.entity.building.Building;
import com.javaweb.batdongsan.entity.customer.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class Contract extends BaseEntity {
    LocalDate startDate;
    LocalDate endDate;
    Double rentPrice;

    @Enumerated(EnumType.STRING)
    ContractStatus status = ContractStatus.ACTIVE;
    String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "building_id")
    Building building;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "staff_id")
    User staff;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    Customer customer;
}
