package com.example.subgateway.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserOrder {
    private int id;
    private String name;
    private float price;
    private String goodName;
}
