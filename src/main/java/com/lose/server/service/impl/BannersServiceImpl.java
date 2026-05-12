package com.lose.server.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lose.server.dao.BannersDao;
import com.lose.server.dto.BannersDTO;
import com.lose.server.service.BannersService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @description: 轮播图管理业务层实现类
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@Service("bannersService")
public class BannersServiceImpl extends ServiceImpl<BannersDao, BannersDTO> implements BannersService {

    @Override
    public Page<BannersDTO> basePage(BannersDTO bannersDTO) {
        if (null != bannersDTO.getCurrent() && null != bannersDTO.getPageSize())
            bannersDTO.setCurrent((bannersDTO.getCurrent() - 1) * bannersDTO.getPageSize());
        List<BannersDTO> list = this.baseMapper.findList(bannersDTO);
        int count = this.baseMapper.findPageCount(bannersDTO);
        Page<BannersDTO> page = new Page<>();
        page.setTotal(count);
        page.setRecords(list);
        return page;
    }

    @Override
    public List<BannersDTO> findList(BannersDTO bannersDTO) {
        return this.baseMapper.findList(bannersDTO);
    }

}
