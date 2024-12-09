package mapper;

import com.utp.proyectofinal.dtos.CourseDto;
import com.utp.proyectofinal.models.Course;

public class CourseMapper {
    public static CourseDto mapToCourseDto(Course course, CourseDto courseDto) {
        courseDto.setName(course.getName());
        return courseDto;
    }

    public static Course mapToCourse(CourseDto courseDto, Course course) {
        course.setName(courseDto.getName());
        return course;
    }
}
