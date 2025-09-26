package com.javaweb.batdongsan.entity;

import com.javaweb.batdongsan.entity.building.Building;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
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
public class PropertyType extends BaseEntity{

    String name;
    String code;
    String description;

    @OneToMany(mappedBy = "propertyType", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List<Building> buildings = new ArrayList<>();
}
