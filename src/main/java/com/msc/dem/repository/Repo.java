package com.msc.dem.repository;

import com.msc.dem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Student, Integer> {
}
