package com.lose.server.entity;

import com.lose.server.common.BaseEntity;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
* @description: 物品记录实体类
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoseGoods extends BaseEntity {

    /**
    * 物品编号
    */
    private Long id;
    /**
    * 物品名称
    */
    private String goodsName;
    /**
    * 物品图片
    */
    private String goodsImg;
    /**
    * 物品信息
    */
    private String goodsInfo;
    /**
    * 所属分类
    */
    private Long typeId;
    /**
    * 类型
    */
    private Integer type;
    /**
    * 所属用户
    */
    private Long userId;
    /**
    * 创建时间
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
    * 丢失地点
    */
    private String location;
    /**
    * 是否悬赏
    */
    private Integer hasMoney;
    /**
    * 悬赏价格
    */
    private String money;
    /**
    * 图片列表
    */
    private String imgList;
    /**
    * 是否匿名
    */
    private Integer hidden;


}
