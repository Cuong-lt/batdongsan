package com.javaweb.batdongsan.entity.transaction;

import com.javaweb.batdongsan.entity.BaseEntity;
import com.javaweb.batdongsan.entity.User;
import com.javaweb.batdongsan.entity.customer.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class Transaction extends BaseEntity {
    @Enumerated(EnumType.STRING)
    TransactionCode code;
    String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "staff_id")
    User staff;
}
