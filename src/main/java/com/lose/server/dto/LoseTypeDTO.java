package com.lose.server.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lose.server.entity. LoseType;
import lombok.Data;
import lombok.ToString;

/**
* @description: 物品分类数据传输层
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@Data
@ToString
@TableName("lose_type")
public class LoseTypeDTO extends LoseType {


}
