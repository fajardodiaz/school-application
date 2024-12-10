package com.utp.proyectofinal.services.implementation;

import com.utp.proyectofinal.dtos.StudentDto;
import com.utp.proyectofinal.models.Student;
import com.utp.proyectofinal.repository.StudentRepository;
import com.utp.proyectofinal.services.IStudentService;
import lombok.AllArgsConstructor;
import mapper.StudentMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentServiceImplementation implements IStudentService {
    private StudentRepository studentRepository;

    @Override
    public void createStudent(StudentDto studentDto) {
        Student student = StudentMapper.mapToStudent(studentDto, new Student());
        studentRepository.save(student);
    }
}
