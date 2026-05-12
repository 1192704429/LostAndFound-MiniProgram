package com.lose.server.entity;

import com.lose.server.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
* @description: 管理员管理实体类
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Admins extends BaseEntity {

    /**
    * 管理员编号
    */
    private Long id;
    /**
    * 昵称
    */
    private String adName;
    /**
    * 账号
    */
    private String adUsername;
    /**
    * 密码
    */
    private String adPassword;
    /**
    * 头像
    */
    private String adHeader;


}
