package com.shop.thekade.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.Date;

@Entity
@Data
public class Payment extends BaseEntity{
    @Id
    @GeneratedValue
    private int id;
    private String type;
    private String slip;
    private String paymentStatus;
    private Date orderDate;
    private Date paidDate;
    private String payment;
}
