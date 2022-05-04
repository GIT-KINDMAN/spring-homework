package com.douzone.homework.repository;

import com.douzone.homework.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    Student save(Student student);
    Optional<Student> findById(Long id);
    Optional<Student> findByName(String name);
    List<Student> findAll();
}
