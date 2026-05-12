package com.lose.server.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lose.server.dto.AdminsDTO;
import java.util.List;
/**
* @description: 管理员管理业务层接口
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
public interface AdminsService extends IService<AdminsDTO> {

    /**
    * 默认分页方法
    * @param adminsDTO
    * @return
    */
    Page<AdminsDTO> basePage(AdminsDTO adminsDTO);


    /**
    * 根据XML中的sql语句进行查询
    * @param adminsDTO
    * @return
    */
    List<AdminsDTO> findList(AdminsDTO adminsDTO);

}
