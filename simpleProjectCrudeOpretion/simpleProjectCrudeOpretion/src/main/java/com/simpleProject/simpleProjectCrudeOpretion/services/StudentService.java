package com.simpleProject.simpleProjectCrudeOpretion.services;

import com.simpleProject.simpleProjectCrudeOpretion.entities.Laptop;
import com.simpleProject.simpleProjectCrudeOpretion.entities.Student;
import com.simpleProject.simpleProjectCrudeOpretion.models.StudentModel;
import com.simpleProject.simpleProjectCrudeOpretion.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public ResponseEntity saveStudentDetailsByUniDirection(StudentModel studentModel) {
        Student student = new Student();
        student.setStudentName(studentModel.getStudentName());
        student.setStudentAddress(studentModel.getStudentAddress());
        student.setStudentEmail(studentModel.getStudentEmail());
        student.setStudentMobileNumbers(studentModel.getStudentMobileNumbers());
        student.setStdId(studentModel.getStdId());

        Laptop laptop = new Laptop();
        laptop.setLapId(studentModel.getLaptopModel().getLapId());
        laptop.setLaptopStore(studentModel.getLaptopModel().getLaptopStore());
        laptop.setLaptopBrandName(studentModel.getLaptopModel().getLaptopBrandName());
        laptop.setLaptopModels(studentModel.getLaptopModel().getLaptopModels());

        student.setLaptop(laptop);
        studentRepository.save(student);
        return new ResponseEntity<>("Save Student Details ", HttpStatus.OK);
    }
}
