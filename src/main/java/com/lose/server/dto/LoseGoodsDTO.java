package com.lose.server.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lose.server.entity. LoseGoods;
import lombok.Data;
import lombok.ToString;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
* @description: 物品记录数据传输层
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@Data
@ToString
@TableName("lose_goods")
public class LoseGoodsDTO extends LoseGoods {

    /**
    * 头像
    */
    @TableField(exist = false)
    private String headerImg;
    /**
    * 姓名
    */
    @TableField(exist = false)
    private String name;
    /**
    * 联系方式
    */
    @TableField(exist = false)
    private String tel;
    @TableField(exist = false)
    private String typeName;

}
