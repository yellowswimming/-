package com.example.order_service.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Service {
    @TableId
    private Integer id; //服务id
    private String name; //服务名
    private String time; //服务创建时间
    private String url; //服务地址
}
