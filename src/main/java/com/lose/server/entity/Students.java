package com.lose.server.entity;

import com.lose.server.common.BaseEntity;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
* @description: 学生用户实体类
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Students extends BaseEntity {

    /**
    * 用户编号
    */
    private Long id;
    /**
    * 用户名
    */
    private String username;
    /**
    * 密码
    */
    private String password;
    /**
    * 头像
    */
    private String headerImg;
    /**
    * 姓名
    */
    private String name;
    /**
    * 联系方式
    */
    private String tel;
    /**
    * 宿舍位置
    */
    private String localtion;
    /**
    * 详细信息
    */
    private String info;
    /**
    * 创建时间
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;


}
