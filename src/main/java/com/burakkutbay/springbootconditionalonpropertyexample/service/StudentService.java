package com.burakkutbay.springbootconditionalonpropertyexample.service;

import com.burakkutbay.springbootconditionalonpropertyexample.record.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public StudentService(DataLayerService dataLayerService) {
        this.dataLayerService = dataLayerService;
    }

    private final DataLayerService dataLayerService;

    public String saveStudent(Student student) {
        return dataLayerService.save(student);
    }

}
