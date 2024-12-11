package com.utp.proyectofinal.services;

import com.utp.proyectofinal.dtos.TeacherDto;
import org.springframework.stereotype.Service;

public interface ITeacherService {
    void createTeacher(TeacherDto teacherDto);
    // List<Teacher> fetchAll();
}
