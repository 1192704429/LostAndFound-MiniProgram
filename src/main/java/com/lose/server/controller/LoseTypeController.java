package com.lose.server.controller;

import com.lose.server.common.BaseController;
import com.lose.server.common.ReturnMsg;
import com.lose.server.dto.LoseTypeDTO;
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
* @description: 物品分类对外接口层
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@RestController
@RequestMapping("/loseType")
public class LoseTypeController extends BaseController<LoseTypeService, LoseTypeDTO> {


    @Override
    @Resource(name = "loseTypeService")
    protected void setBaseService(LoseTypeService loseTypeService) {
        this.baseService = loseTypeService;
    }

    /**
    * 默认分页查询
    * @param loseTypeDTO
    * @return
    */
    @PostMapping("/page")
    public ReturnMsg page(@RequestBody LoseTypeDTO loseTypeDTO) {
        return ReturnMsg.ok(baseService.basePage(loseTypeDTO));
    }

    /**
    * 根据XML中的sql语句进行查询
    * @param loseTypeDTO
    * @return
    */
    @PostMapping(value = "/findList")
    public ReturnMsg findList(@RequestBody LoseTypeDTO loseTypeDTO) {
        return ReturnMsg.ok(baseService.findList(loseTypeDTO));
    }

    @Override
    protected void beforeSave(LoseTypeDTO entity) throws Exception {
        entity.setCreateTime(new Date());
        super.beforeSave(entity);
    }

}

