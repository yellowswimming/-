package com.example.order_service.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("goodOrder")
public class Order {
    private Integer id;
    @TableField("good_name")
    private String goodName;
    private float price;
}
