package com.lose.server.entity;

import com.lose.server.common.BaseEntity;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
* @description: 轮播图管理实体类
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Banners extends BaseEntity {

    /**
    * 轮播图编号
    */
    private Long id;
    /**
    * 轮播地址
    */
    private String bannerUrl;
    /**
    * 创建时间
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
    * 轮播标题
    */
    private String bannerName;
    /**
    * 轮播内容
    */
    private String content;


}
