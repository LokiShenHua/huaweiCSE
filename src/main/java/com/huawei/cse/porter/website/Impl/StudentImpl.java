package com.huawei.cse.porter.website.Impl;

import com.huawei.cse.porter.website.dao.StudentMapper;
import com.huawei.cse.porter.website.pojo.Student;
import com.huawei.cse.porter.website.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Student> showStudents(){
        return studentMapper.findAll();
    }




}
