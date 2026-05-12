package com.lose.server.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lose.server.dao.AdminsDao;
import com.lose.server.dto.AdminsDTO;
import com.lose.server.service.AdminsService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @description: 管理员管理业务层实现类
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@Service("adminsService")
public class AdminsServiceImpl extends ServiceImpl<AdminsDao, AdminsDTO> implements AdminsService {

    @Override
    public Page<AdminsDTO> basePage(AdminsDTO adminsDTO) {
        if (null != adminsDTO.getCurrent() && null != adminsDTO.getPageSize())
            adminsDTO.setCurrent((adminsDTO.getCurrent() - 1) * adminsDTO.getPageSize());
        List<AdminsDTO> list = this.baseMapper.findList(adminsDTO);
        int count = this.baseMapper.findPageCount(adminsDTO);
        Page<AdminsDTO> page = new Page<>();
        page.setTotal(count);
        page.setRecords(list);
        return page;
    }

    @Override
    public List<AdminsDTO> findList(AdminsDTO adminsDTO) {
        return this.baseMapper.findList(adminsDTO);
    }

}
