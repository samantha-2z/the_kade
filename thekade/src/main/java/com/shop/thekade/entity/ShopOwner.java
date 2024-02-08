package com.shop.thekade.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ShopOwner extends BaseEntity{
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private String tel;
}
