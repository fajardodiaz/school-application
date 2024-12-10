package com.utp.proyectofinal.controllers;

import com.utp.proyectofinal.dtos.StudentDto;
import com.utp.proyectofinal.models.Student;
import com.utp.proyectofinal.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping("/students/register")
    public String getStudent(Model model) {
        model.addAttribute("student", new StudentDto());
        return "student_register";
    }

    @PostMapping("/students/register")
    public String createStudent(@ModelAttribute("student") StudentDto studentDto) {
        studentService.createStudent(studentDto);
        return "redirect:/students";
    }
}

