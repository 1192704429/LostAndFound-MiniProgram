package com.lose.server.controller;

import com.lose.server.common.BaseController;
import com.lose.server.common.ReturnMsg;
import com.lose.server.dto.LoseGoodsDTO;
import com.lose.server.service.LoseGoodsService;
import com.lose.server.service.LoseTypeService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import com.lose.server.common.BaseSelectEntity;
import cn.hutool.core.collection.CollectionUtil;

import java.util.Date;

/**
 * @description: 物品记录对外接口层
 * @author: wuming
 * @create: 2023.04.06 11:23:59
 */
@RestController
@RequestMapping("/loseGoods")
public class LoseGoodsController extends BaseController<LoseGoodsService, LoseGoodsDTO> {

    @Autowired
    private LoseTypeService loseTypeService;

    @Override
    @Resource(name = "loseGoodsService")
    protected void setBaseService(LoseGoodsService loseGoodsService) {
        this.baseService = loseGoodsService;
    }

    /**
     * 默认分页查询
     *
     * @param loseGoodsDTO
     * @return
     */
    @PostMapping("/page")
    public ReturnMsg page(@RequestBody LoseGoodsDTO loseGoodsDTO) {
        return ReturnMsg.ok(baseService.basePage(loseGoodsDTO));
    }

    /**
     * 根据XML中的sql语句进行查询
     *
     * @param loseGoodsDTO
     * @return
     */
    @PostMapping(value = "/findList")
    public ReturnMsg findList(@RequestBody LoseGoodsDTO loseGoodsDTO) {
        return ReturnMsg.ok(baseService.findList(loseGoodsDTO));
    }

    @Override
    protected ReturnMsg afterGetById(LoseGoodsDTO entity) throws Exception {
        entity.setTypeName(loseTypeService.getById(entity.getTypeId()).getTypeName());
        return super.afterGetById(entity);
    }

    @Override
    protected void beforeSave(LoseGoodsDTO entity) throws Exception {
        entity.setCreateTime(new Date());
        super.beforeSave(entity);
    }

}

