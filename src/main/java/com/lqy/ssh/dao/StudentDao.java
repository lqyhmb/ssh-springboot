package com.lqy.ssh.dao;

import com.lqy.ssh.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Rodriguez
 * 2018/6/25 15:32
 */
@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {


}
