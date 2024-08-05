package com.msc.dem.service;

import com.msc.dem.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {

    public List<Student> getAllStudents();
}
