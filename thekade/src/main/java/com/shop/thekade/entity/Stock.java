package com.shop.thekade.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Stock extends BaseEntity{
    @Id
    @GeneratedValue
    private int id;
    private String description;
    private String employeId;
    private String stockId;
    private String location;
    private String bundlePerPapers;
    private String bundle;
    private String stockPrice;

}
