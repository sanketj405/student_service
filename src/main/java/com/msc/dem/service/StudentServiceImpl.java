package com.msc.dem.service;

import com.msc.dem.entity.Student;
import com.msc.dem.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    Repo repo;
    @Override
    public List<Student> getAllStudents() {
        return repo.findAll();
    }
}
