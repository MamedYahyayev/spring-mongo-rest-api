package az.maqa.spring.mongo.service.impl;

import az.maqa.spring.mongo.dto.StudentDto;
import az.maqa.spring.mongo.entity.Student;
import az.maqa.spring.mongo.repository.StudentRepository;
import az.maqa.spring.mongo.service.StudentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;
    private final ModelMapper modelMapper;

    public StudentServiceImpl(StudentRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public StudentDto createStudent(StudentDto studentDto) {
        Student student = modelMapper.map(studentDto, Student.class);
        Student savedStudent = repository.save(student);
        return modelMapper.map(savedStudent, StudentDto.class);
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = repository.findAll();
        Type listType = new TypeToken<List<StudentDto>>() {
        }.getType();
        return modelMapper.map(students, listType);
    }
}
