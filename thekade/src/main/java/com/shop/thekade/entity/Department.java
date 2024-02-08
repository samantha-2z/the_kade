package com.shop.thekade.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Entity
public class Department extends BaseEntity {
    @Id
    @GeneratedValue
    private int id;
    private String depatrmentName;
}
