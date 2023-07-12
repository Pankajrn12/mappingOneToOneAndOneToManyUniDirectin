package com.simpleProject.simpleProjectCrudeOpretion.resources;

import com.simpleProject.simpleProjectCrudeOpretion.models.StudentModel;
import com.simpleProject.simpleProjectCrudeOpretion.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abc")
public class StudentResource  {
    @Autowired
    StudentService studentService;

    @PostMapping("/saveStudentDetailsByUniDirection")
    public ResponseEntity saveStudentDetailsByUniDirection(@RequestBody StudentModel studentModel){
        return studentService.saveStudentDetailsByUniDirection(studentModel);
    }

}
