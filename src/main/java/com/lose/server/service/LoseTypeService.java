package com.lose.server.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lose.server.dto.LoseTypeDTO;
import java.util.List;
/**
* @description: 物品分类业务层接口
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
public interface LoseTypeService extends IService<LoseTypeDTO> {

    /**
    * 默认分页方法
    * @param loseTypeDTO
    * @return
    */
    Page<LoseTypeDTO> basePage(LoseTypeDTO loseTypeDTO);


    /**
    * 根据XML中的sql语句进行查询
    * @param loseTypeDTO
    * @return
    */
    List<LoseTypeDTO> findList(LoseTypeDTO loseTypeDTO);

}
