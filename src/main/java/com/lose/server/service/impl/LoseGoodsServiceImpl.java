package com.lose.server.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lose.server.dao.LoseGoodsDao;
import com.lose.server.dto.LoseGoodsDTO;
import com.lose.server.service.LoseGoodsService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @description: 物品记录业务层实现类
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@Service("loseGoodsService")
public class LoseGoodsServiceImpl extends ServiceImpl<LoseGoodsDao, LoseGoodsDTO> implements LoseGoodsService {

    @Override
    public Page<LoseGoodsDTO> basePage(LoseGoodsDTO loseGoodsDTO) {
        if (null != loseGoodsDTO.getCurrent() && null != loseGoodsDTO.getPageSize())
            loseGoodsDTO.setCurrent((loseGoodsDTO.getCurrent() - 1) * loseGoodsDTO.getPageSize());
        List<LoseGoodsDTO> list = this.baseMapper.findList(loseGoodsDTO);
        int count = this.baseMapper.findPageCount(loseGoodsDTO);
        Page<LoseGoodsDTO> page = new Page<>();
        page.setTotal(count);
        page.setRecords(list);
        return page;
    }

    @Override
    public List<LoseGoodsDTO> findList(LoseGoodsDTO loseGoodsDTO) {
        return this.baseMapper.findList(loseGoodsDTO);
    }

}
