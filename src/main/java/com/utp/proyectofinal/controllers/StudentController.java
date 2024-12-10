package com.utp.proyectofinal.controllers;

import com.utp.proyectofinal.dtos.StudentDto;
import com.utp.proyectofinal.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @PostMapping("/register")
    public Student createStudent(StudentDto studentDto) {

    }
}
