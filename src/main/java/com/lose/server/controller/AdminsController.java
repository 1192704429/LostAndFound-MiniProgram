package com.lose.server.controller;

import com.lose.server.common.BaseController;
import com.lose.server.common.ReturnMsg;
import com.lose.server.dto.AdminsDTO;
import com.lose.server.service.AdminsService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.annotation.Resource;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import com.lose.server.common.BaseSelectEntity;
import cn.hutool.core.collection.CollectionUtil;
/**
* @description: 管理员管理对外接口层
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@RestController
@RequestMapping("/admins")
public class AdminsController extends BaseController<AdminsService, AdminsDTO> {


    @Override
    @Resource(name = "adminsService")
    protected void setBaseService(AdminsService adminsService) {
        this.baseService = adminsService;
    }

    /**
    * 默认分页查询
    * @param adminsDTO
    * @return
    */
    @PostMapping("/page")
    public ReturnMsg page(@RequestBody AdminsDTO adminsDTO) {
        return ReturnMsg.ok(baseService.basePage(adminsDTO));
    }

    /**
    * 根据XML中的sql语句进行查询
    * @param adminsDTO
    * @return
    */
    @PostMapping(value = "/findList")
    public ReturnMsg findList(@RequestBody AdminsDTO adminsDTO) {
        return ReturnMsg.ok(baseService.findList(adminsDTO));
    }


}

