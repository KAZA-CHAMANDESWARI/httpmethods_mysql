package com.example.demo.Controller;
import com.example.demo.Model.StudentDetails;
import com.example.demo.Service.ConduiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/StudentData")
public class ConduiraController {
        private ConduiraService conduiraService;

        @Autowired
        public ConduiraController(ConduiraService conduiraService) {
            this.conduiraService = conduiraService;
        }


        //http methods
        @PostMapping(produces = "application/json", value = "/addStudentDetails")
        public ResponseEntity<String> addStudentDetails(@RequestBody StudentDetails studentDetails) {
            conduiraService.addStudentData(studentDetails);
            return ResponseEntity.ok("Data added");

        }

        //http methods
        @GetMapping(value = "/getStudentDetails")
        public ResponseEntity<List<String>> getStudentDetails() {
            return ResponseEntity.ok(conduiraService.getStudentData());

        }


    }

