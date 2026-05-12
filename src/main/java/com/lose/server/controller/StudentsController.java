package com.lose.server.controller;

import com.lose.server.common.BaseController;
import com.lose.server.common.ReturnMsg;
import com.lose.server.dto.StudentsDTO;
import com.lose.server.service.StudentsService;
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
* @description: 学生用户对外接口层
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@RestController
@RequestMapping("/students")
public class StudentsController extends BaseController<StudentsService, StudentsDTO> {


    @Override
    @Resource(name = "studentsService")
    protected void setBaseService(StudentsService studentsService) {
        this.baseService = studentsService;
    }

    /**
    * 默认分页查询
    * @param studentsDTO
    * @return
    */
    @PostMapping("/page")
    public ReturnMsg page(@RequestBody StudentsDTO studentsDTO) {
        return ReturnMsg.ok(baseService.basePage(studentsDTO));
    }

    /**
    * 根据XML中的sql语句进行查询
    * @param studentsDTO
    * @return
    */
    @PostMapping(value = "/findList")
    public ReturnMsg findList(@RequestBody StudentsDTO studentsDTO) {
        return ReturnMsg.ok(baseService.findList(studentsDTO));
    }

    @Override
    protected void beforeSave(StudentsDTO entity) throws Exception {
        entity.setCreateTime(new Date());
        super.beforeSave(entity);
    }

}

