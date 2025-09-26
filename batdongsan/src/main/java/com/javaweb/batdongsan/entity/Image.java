package com.javaweb.batdongsan.entity;

import com.javaweb.batdongsan.entity.building.Building;
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
public class Image extends BaseEntity{
    String url;
    String altText;
    Integer isPrimary = 0;

    @ManyToOne(fetch = FetchType.LAZY)
            @JoinColumn(name = "building_id")
    Building building;
}
