package com.swjd.service;

import com.swjd.exception.UserNotFoundException;
import com.swjd.pojo.ResultPage;
import com.swjd.pojo.Student;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface StudentService {
    public Student login(Integer id,String password) throws UserNotFoundException;

    public ResultPage findAll(Integer currPage, Integer pageSize,Student student);

    public List<String> findCollege();

    List<String> findClassName(String collegeName);

    void deleteStu(Integer id);

    void addStu(Student student);

    Student findById(Integer id);

    void updateStu(Student student);
}
