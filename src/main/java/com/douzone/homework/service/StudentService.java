package com.douzone.homework.service;

import com.douzone.homework.domain.Student;
import com.douzone.homework.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /**
     * 회원가입
     */
    public Long join(Student student) {
//            validateDuplicateMember(student); //중복 회원 검증
            studentRepository.save(student);
            return student.getId();
    }
    /**
     * 전체 회원 조회
     */
    public List<Student> findStudents() {
            return studentRepository.findAll();
    }
}
