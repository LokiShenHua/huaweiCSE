package com.huawei.cse.porter.website.controller;


import com.huawei.cse.porter.website.pojo.Student;
import com.huawei.cse.porter.website.service.StudentService;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestSchema(schemaId = "student")
@RequestMapping(path = "/loki")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(path = "/listStudent", method = RequestMethod.GET)
    public List<Student> listStudent() {
        List<Student> students = studentService.showStudents();
        return students;
    }
}
