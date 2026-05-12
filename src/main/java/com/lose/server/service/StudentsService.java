package com.lose.server.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lose.server.dto.StudentsDTO;
import java.util.List;
/**
* @description: 学生用户业务层接口
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
public interface StudentsService extends IService<StudentsDTO> {

    /**
    * 默认分页方法
    * @param studentsDTO
    * @return
    */
    Page<StudentsDTO> basePage(StudentsDTO studentsDTO);


    /**
    * 根据XML中的sql语句进行查询
    * @param studentsDTO
    * @return
    */
    List<StudentsDTO> findList(StudentsDTO studentsDTO);

}
