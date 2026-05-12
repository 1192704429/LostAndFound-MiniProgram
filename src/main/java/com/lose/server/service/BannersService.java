package com.lose.server.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lose.server.dto.BannersDTO;
import java.util.List;
/**
* @description: 轮播图管理业务层接口
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
public interface BannersService extends IService<BannersDTO> {

    /**
    * 默认分页方法
    * @param bannersDTO
    * @return
    */
    Page<BannersDTO> basePage(BannersDTO bannersDTO);


    /**
    * 根据XML中的sql语句进行查询
    * @param bannersDTO
    * @return
    */
    List<BannersDTO> findList(BannersDTO bannersDTO);

}
