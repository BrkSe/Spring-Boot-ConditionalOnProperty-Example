package com.burakkutbay.springbootconditionalonpropertyexample.service;

import com.burakkutbay.springbootconditionalonpropertyexample.record.Student;


public class InMemoryServiceImpl implements DataLayerService {
    @Override
    public String save(Student student) {
        return "Saved Student to Database " + student.id();
    }
}
