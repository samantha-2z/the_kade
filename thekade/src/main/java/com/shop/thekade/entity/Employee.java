package com.shop.thekade.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String employeeName;
    private String employment;
    private String tel;
    private String position;
    private String address;
}
