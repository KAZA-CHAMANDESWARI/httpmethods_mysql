package com.example.demo.Service;

import com.example.demo.Model.StudentDetails;

import java.util.List;

public interface ConduiraService {
    public void addStudentData(StudentDetails studentDetails);

    public List<String> getStudentData();

}
