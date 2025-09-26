package com.javaweb.batdongsan.entity.customer;

import com.javaweb.batdongsan.entity.AssignmentCustomer;
import com.javaweb.batdongsan.entity.BaseEntity;
import com.javaweb.batdongsan.entity.Feedback;
import com.javaweb.batdongsan.entity.contract.Contract;
import com.javaweb.batdongsan.entity.transaction.Transaction;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class Customer extends BaseEntity {
    String fullName;
    String phone;
    String email;
    String companyName;
    @Enumerated(EnumType.STRING)
    DemandType demand;
    String address;
    @Enumerated(EnumType.STRING)
    CustomerStatus status = CustomerStatus.ACTIVE;
    @Enumerated(EnumType.STRING)
    CustomerType type;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List<Contract> contracts = new ArrayList<>(); ;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List<AssignmentCustomer> assignmentCustomers = new ArrayList<>();

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List<Transaction> transactions = new ArrayList<>();

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List<Feedback> feedbacks = new ArrayList<>();
}
