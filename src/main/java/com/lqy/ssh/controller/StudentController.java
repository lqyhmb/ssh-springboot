package com.lqy.ssh.controller;

import com.lqy.ssh.entity.Student;
import com.lqy.ssh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Rodriguez
 * 2018/6/25 15:36
 */
@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;


    @RequestMapping(value = "/findAll")
    @ResponseBody
    public List<Student> findAll() {
        return studentService.findAll();
    }

}
