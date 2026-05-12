package com.lose.server.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lose.server.entity. Admins;
import lombok.Data;
import lombok.ToString;

/**
* @description: 管理员管理数据传输层
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@Data
@ToString
@TableName("admins")
public class AdminsDTO extends Admins {


}
