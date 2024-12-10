package mapper;

import com.utp.proyectofinal.dtos.StudentDto;
import com.utp.proyectofinal.models.Student;

public class StudentMapper {
    public static StudentDto mapToStudentDto(Student student, StudentDto studentDto) {
        studentDto.setFirstName(student.getFirstName());
        studentDto.setLastName(student.getLastName());
        studentDto.setEmail(student.getEmail());
        studentDto.setCollegeYear(student.getCollegeYear());
        return studentDto;
    }

    public static Student mapToStudent(StudentDto studentDto, Student student) {
        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        student.setEmail(studentDto.getEmail());
        student.setCollegeYear(studentDto.getCollegeYear());
        return student;
    }
}
