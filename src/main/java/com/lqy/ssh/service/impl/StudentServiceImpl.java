package com.lqy.ssh.service.impl;

import com.lqy.ssh.dao.StudentDao;
import com.lqy.ssh.entity.Student;
import com.lqy.ssh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rodriguez
 * 2018/6/25 15:34
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
