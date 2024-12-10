package com.utp.proyectofinal.services.implementation;

import com.utp.proyectofinal.dtos.TeacherDto;
import com.utp.proyectofinal.models.Teacher;
import com.utp.proyectofinal.repository.TeacherRepository;
import com.utp.proyectofinal.services.ITeacherService;
import mapper.TeacherMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class TeacherServiceImplementation implements ITeacherService {
    private TeacherRepository teacherRepository;

    @Override
    public void createTeacher(TeacherDto teacherDto) {
        Teacher teacher = TeacherMapper.mapToTeacher(teacherDto, new Teacher());
        Teacher savedTeacher = teacherRepository.save(teacher);
    }
}
