package com.douzone.homework.service;
//package service;

import com.douzone.homework.domain.Student;
import com.douzone.homework.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
public class StudentServiceIntegrationTest {

    @Autowired
    StudentService studentService;
    @Autowired
    StudentRepository studentRepository;

    @Test
    @Commit
    public void 학생가입() throws Exception {
        //Given
        Student student = new Student();
        student.setName("B");
        student.setMusic(90);
        student.setArt(80);
        student.setAth(100);
        student.setSum();
        student.setAvg();

        //When
        Long saveId = studentService.join(student);

        //Then
        Student findStudent = studentRepository.findById(saveId).get(); // 단순하게 받기 위해 맨 뒤에 get()으로 가져오는 것 뿐
        assertEquals(student.getName(), findStudent.getName()); // Alt + Enter로 static 행
    }

}
