package com.burakkutbay.springbootconditionalonpropertyexample.service;

import com.burakkutbay.springbootconditionalonpropertyexample.record.Student;


public class DatabaseServiceImpl implements DataLayerService {
    @Override
    public String save(Student student) {
        return "Saved Student to InMemory " + student.id();
    }
}
