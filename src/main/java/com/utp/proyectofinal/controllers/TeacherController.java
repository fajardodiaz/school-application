package com.utp.proyectofinal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.utp.proyectofinal.dtos.TeacherDto;
import com.utp.proyectofinal.services.ITeacherService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import com.utp.proyectofinal.services.ITeacherService;


@Controller
public class TeacherController {
    @Autowired
    private ITeacherService teacherService;

    @GetMapping("/teachers/register")
    public String getStudent(Model model) {
        model.addAttribute("teacher", new TeacherDto());
        return "teacher_register";
    }

    @PostMapping("/teachers/register")
    public String createStudent(@ModelAttribute("teacher") TeacherDto teacherDto) {
        teacherService.createTeacher(teacherDto);
        return "redirect:/teachers";
    }
}
