package com.douzone.homework.controller;

import com.douzone.homework.domain.Student;
import com.douzone.homework.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students/new") // home.html에 지정됐던 회원 가입 href 으로 이동됨
    public String createForm() {
        return "students/createStudentForm";
    }

    @PostMapping("/students/new")
    public String create(StudentForm form) {
        Student student = new Student();
        student.setName(form.getName());
        student.setMusic(form.getMusic());
        student.setArt(form.getArt());
        student.setAth(form.getAth());
        student.setSum();
        student.setAvg();


        studentService.join(student);

        return "redirect:/"; // 회원가입 끝났으니 home으로 보내버리는 것
    }

    @GetMapping(value = "/students")
    public String list(Model model) {
        List<Student> students = studentService.findStudents();
        model.addAttribute("students", students);
        return "students/studentsList";
    }
}

