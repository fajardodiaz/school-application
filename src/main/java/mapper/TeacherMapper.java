package mapper;

import com.utp.proyectofinal.dtos.TeacherDto;
import com.utp.proyectofinal.models.Teacher;

public class TeacherMapper {
    public static TeacherDto mapToTeacherDto(Teacher teacher, TeacherDto teacherDto) {
        teacherDto.setFirstName(teacher.getFirstName());
        teacherDto.setLastName(teacher.getLastName());
        teacherDto.setEmail(teacher.getEmail());
        teacherDto.setSpecialty(teacher.getSpecialty());
        teacherDto.setDegree(teacher.getDegree());
        return teacherDto;
    }

    public static Teacher mapToTeacher(TeacherDto teacherDto, Teacher teacher) {
        teacher.setFirstName(teacherDto.getFirstName());
        teacher.setLastName(teacherDto.getLastName());
        teacher.setEmail(teacherDto.getEmail());
        teacher.setSpecialty(teacherDto.getSpecialty());
        teacher.setDegree(teacherDto.getDegree());
        return teacher;
    }
}
