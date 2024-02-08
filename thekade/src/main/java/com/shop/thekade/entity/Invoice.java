package com.shop.thekade.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Invoice extends BaseEntity{
    @Id
    @GeneratedValue
    private int id;
    private String companyName;
    private Date createDate;
    private int stockId;

}
