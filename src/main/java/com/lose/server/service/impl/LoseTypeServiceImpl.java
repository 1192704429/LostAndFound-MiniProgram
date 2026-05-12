package com.lose.server.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lose.server.dao.LoseTypeDao;
import com.lose.server.dto.LoseTypeDTO;
import com.lose.server.service.LoseTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @description: 物品分类业务层实现类
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@Service("loseTypeService")
public class LoseTypeServiceImpl extends ServiceImpl<LoseTypeDao, LoseTypeDTO> implements LoseTypeService {

    @Override
    public Page<LoseTypeDTO> basePage(LoseTypeDTO loseTypeDTO) {
        if (null != loseTypeDTO.getCurrent() && null != loseTypeDTO.getPageSize())
            loseTypeDTO.setCurrent((loseTypeDTO.getCurrent() - 1) * loseTypeDTO.getPageSize());
        List<LoseTypeDTO> list = this.baseMapper.findList(loseTypeDTO);
        int count = this.baseMapper.findPageCount(loseTypeDTO);
        Page<LoseTypeDTO> page = new Page<>();
        page.setTotal(count);
        page.setRecords(list);
        return page;
    }

    @Override
    public List<LoseTypeDTO> findList(LoseTypeDTO loseTypeDTO) {
        return this.baseMapper.findList(loseTypeDTO);
    }

}
