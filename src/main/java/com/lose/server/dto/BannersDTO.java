package com.lose.server.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lose.server.entity. Banners;
import lombok.Data;
import lombok.ToString;

/**
* @description: 轮播图管理数据传输层
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@Data
@ToString
@TableName("banners")
public class BannersDTO extends Banners {


}
