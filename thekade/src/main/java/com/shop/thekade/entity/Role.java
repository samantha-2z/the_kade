package com.shop.thekade.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Role extends BaseEntity{
    @Id
    @GeneratedValue
    private int id;
    private String role;
    private String employId;
}
