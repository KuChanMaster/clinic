package com.swjd.service;

import com.swjd.exception.UserNotFoundException;
import com.swjd.pojo.Doctor;
import com.swjd.pojo.ResultPage;
import com.swjd.pojo.Student;

import java.util.List;

public interface DoctorService {
    public Doctor login(Integer id, String password) throws UserNotFoundException;

    ResultPage findAll(Integer currPage, Integer pageSize, Doctor doctor);

    List<String> findRoom();

    void addDoc(Doctor doctor);

    void deleteStu(Integer id);

    Doctor findById(Integer id);

    void updateDoc(Doctor doctor);
}
