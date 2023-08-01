package com.burakkutbay.springbootconditionalonpropertyexample.controller;

import com.burakkutbay.springbootconditionalonpropertyexample.record.Student;
import com.burakkutbay.springbootconditionalonpropertyexample.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public String saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
}
