package com.shop.thekade.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "'order'")
public class Order extends BaseEntity{
    @Id
    @GeneratedValue
    private int id;
    private String quntatiy;
    private Date orderDate;
    private String description;
    private String cost;

}
