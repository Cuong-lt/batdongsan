package com.javaweb.batdongsan.entity.building;

import com.javaweb.batdongsan.entity.*;
import com.javaweb.batdongsan.entity.contract.Contract;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class Building  extends BaseEntity {
    String name;
    String street;
    String ward;
    String district;
    Integer numberOfBasement;
    Integer floorArea;
    int rentPrice;
    Double serviceFee;
    Double waterFee;
    Double electricityFee;
    Double deposit;
    String payment;
    LocalDate rentTime;

    @Enumerated(EnumType.STRING)
    BuildingType buildingType;

    String note;
    String linkOfBuilding;
    String map;
    String description;

    @Enumerated(EnumType.STRING)
    BuildingStatus status = BuildingStatus.AVAILABLE;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    User owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_type_id")
    PropertyType propertyType;

    @OneToMany(mappedBy = "building", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List<Image> images = new ArrayList<>();

    @OneToMany(mappedBy = "building", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List<RentArea> rentAreas = new ArrayList<>();

    @OneToMany(mappedBy = "building", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List<AssignmentBuilding> assignmentBuildings = new ArrayList<>();

    @OneToMany(mappedBy = "building", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List<Contract> contracts = new ArrayList<>();

    @OneToMany(mappedBy = "building", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List<Feedback> feedbacks = new ArrayList<>();
}
