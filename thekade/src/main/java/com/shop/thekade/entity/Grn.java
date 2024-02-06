package com.shop.thekade.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Grn extends BaseEntity{
    @Id
    @GeneratedValue
    private int id;
    private String orderNo;
    private String description;
    private String quantatity;
    private String rate;
    private String total;


}
