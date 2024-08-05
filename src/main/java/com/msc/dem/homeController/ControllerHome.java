package com.msc.dem.homeController;


import com.msc.dem.entity.Student;
import com.msc.dem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerHome {

    @Autowired
    StudentService studentService;

    @GetMapping("/getall")
    public List<Student> getALLStudents(Student student){
        return studentService.getAllStudents();
    }
}
