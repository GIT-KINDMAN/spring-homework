package com.douzone.homework.repository;

import com.douzone.homework.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

interface SpringDataJpaRepository extends JpaRepository<Student, Long>, StudentRepository {

    @Override
    Optional<Student> findByName(String name);

}
