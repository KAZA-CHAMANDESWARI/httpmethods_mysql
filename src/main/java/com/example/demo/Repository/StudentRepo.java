package com.example.demo.Repository;

import com.example.demo.Model.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<StudentDetails,Long> {
    @Query(value = "SELECT t.student FROM students_details t",nativeQuery = true)
    List<String> allStudentNames();
}
