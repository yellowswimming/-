package com.example.subgateway.Pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("goodorder")
public class Order {
    private Integer id;
    private String goodName;
    private float price;
}
