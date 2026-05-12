package com.lose.server.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lose.server.dto.LoseGoodsDTO;
import java.util.List;
/**
* @description: 物品记录业务层接口
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
public interface LoseGoodsService extends IService<LoseGoodsDTO> {

    /**
    * 默认分页方法
    * @param loseGoodsDTO
    * @return
    */
    Page<LoseGoodsDTO> basePage(LoseGoodsDTO loseGoodsDTO);


    /**
    * 根据XML中的sql语句进行查询
    * @param loseGoodsDTO
    * @return
    */
    List<LoseGoodsDTO> findList(LoseGoodsDTO loseGoodsDTO);

}
