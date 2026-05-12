package com.lose.server.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lose.server.dao.StudentsDao;
import com.lose.server.dto.StudentsDTO;
import com.lose.server.service.StudentsService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @description: 学生用户业务层实现类
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@Service("studentsService")
public class StudentsServiceImpl extends ServiceImpl<StudentsDao, StudentsDTO> implements StudentsService {

    @Override
    public Page<StudentsDTO> basePage(StudentsDTO studentsDTO) {
        if (null != studentsDTO.getCurrent() && null != studentsDTO.getPageSize())
            studentsDTO.setCurrent((studentsDTO.getCurrent() - 1) * studentsDTO.getPageSize());
        List<StudentsDTO> list = this.baseMapper.findList(studentsDTO);
        int count = this.baseMapper.findPageCount(studentsDTO);
        Page<StudentsDTO> page = new Page<>();
        page.setTotal(count);
        page.setRecords(list);
        return page;
    }

    @Override
    public List<StudentsDTO> findList(StudentsDTO studentsDTO) {
        return this.baseMapper.findList(studentsDTO);
    }

}
