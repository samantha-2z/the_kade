package com.shop.thekade.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Item extends BaseEntity{
    @Id
    @GeneratedValue
    private int id;
    private String type;
    private String brand;
    private String colour;
    private String salesPrice;
}
