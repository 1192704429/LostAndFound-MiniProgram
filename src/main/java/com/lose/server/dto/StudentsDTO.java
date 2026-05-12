package com.lose.server.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lose.server.entity. Students;
import lombok.Data;
import lombok.ToString;

/**
* @description: 学生用户数据传输层
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@Data
@ToString
@TableName("students")
public class StudentsDTO extends Students {


}
