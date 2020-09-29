package az.maqa.spring.mongo.service;

import az.maqa.spring.mongo.dto.StudentDto;

import java.util.List;

public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);

    List<StudentDto> getAllStudents();
}
