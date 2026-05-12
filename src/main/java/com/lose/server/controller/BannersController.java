package com.lose.server.controller;

import com.lose.server.common.BaseController;
import com.lose.server.common.ReturnMsg;
import com.lose.server.dto.BannersDTO;
import com.lose.server.service.BannersService;
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
* @description: 轮播图管理对外接口层
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@RestController
@RequestMapping("/banners")
public class BannersController extends BaseController<BannersService, BannersDTO> {


    @Override
    @Resource(name = "bannersService")
    protected void setBaseService(BannersService bannersService) {
        this.baseService = bannersService;
    }

    /**
    * 默认分页查询
    * @param bannersDTO
    * @return
    */
    @PostMapping("/page")
    public ReturnMsg page(@RequestBody BannersDTO bannersDTO) {
        return ReturnMsg.ok(baseService.basePage(bannersDTO));
    }

    /**
    * 根据XML中的sql语句进行查询
    * @param bannersDTO
    * @return
    */
    @PostMapping(value = "/findList")
    public ReturnMsg findList(@RequestBody BannersDTO bannersDTO) {
        return ReturnMsg.ok(baseService.findList(bannersDTO));
    }

    @Override
    protected void beforeSave(BannersDTO entity) throws Exception {
        entity.setCreateTime(new Date());
        super.beforeSave(entity);
    }

}

