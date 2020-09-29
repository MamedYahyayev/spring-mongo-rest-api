package az.maqa.spring.mongo.controller;

import az.maqa.spring.mongo.dto.StudentDto;
import az.maqa.spring.mongo.request.RequestStudent;
import az.maqa.spring.mongo.response.ResponseStudent;
import az.maqa.spring.mongo.service.StudentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;
    private final ModelMapper modelMapper;

    public StudentController(StudentService studentService, ModelMapper modelMapper) {
        this.studentService = studentService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public ResponseStudent createStudent(@RequestBody RequestStudent requestStudent) {
        StudentDto studentDto = modelMapper.map(requestStudent, StudentDto.class);
        StudentDto createdStudent = studentService.createStudent(studentDto);
        return modelMapper.map(createdStudent, ResponseStudent.class);
    }

    @GetMapping
    public List<ResponseStudent> getAllStudents() {
        List<StudentDto> studentDtoList = studentService.getAllStudents();
        Type listType = new TypeToken<List<ResponseStudent>>() {
        }.getType();
        return modelMapper.map(studentDtoList, listType);
    }

}
