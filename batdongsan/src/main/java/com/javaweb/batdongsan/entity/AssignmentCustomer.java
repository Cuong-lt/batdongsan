package com.javaweb.batdongsan.entity;

import com.javaweb.batdongsan.entity.customer.Customer;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class AssignmentCustomer extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
            @JoinColumn(name = "staff_id")
    User staff;
}
