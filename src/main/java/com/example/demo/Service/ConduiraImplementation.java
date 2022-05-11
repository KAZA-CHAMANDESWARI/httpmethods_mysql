package com.example.demo.Service;

import com.example.demo.Model.StudentDetails;
import com.example.demo.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ConduiraImplementation implements ConduiraService {
    private StudentRepo studentRepo;

    @Autowired
    public ConduiraImplementation(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
    @Override
    public void addStudentData(StudentDetails studentDetails) {
        studentRepo.save(studentDetails);
    }

    @Override
    public List<String> getStudentData() {
        return studentRepo.allStudentNames();
    }
}
