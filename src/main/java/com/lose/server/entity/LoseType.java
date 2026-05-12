package com.lose.server.entity;

import com.lose.server.common.BaseEntity;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
* @description: 物品分类实体类
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoseType extends BaseEntity {

    /**
    * 分类编号
    */
    private Long id;
    /**
    * 分类名称
    */
    private String typeName;
    /**
    * 创建时间
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;


}
