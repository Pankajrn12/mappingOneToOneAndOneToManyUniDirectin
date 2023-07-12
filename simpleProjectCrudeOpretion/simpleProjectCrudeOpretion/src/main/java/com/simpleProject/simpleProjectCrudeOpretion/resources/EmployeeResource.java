package com.simpleProject.simpleProjectCrudeOpretion.resources;

import com.simpleProject.simpleProjectCrudeOpretion.models.EmployeeModels;
import com.simpleProject.simpleProjectCrudeOpretion.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xyz")
public class EmployeeResource {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/saveEmployeeDetailsUniDirection")
    public ResponseEntity saveEmployeeDetailsUniDirection(@RequestBody EmployeeModels employeeModels){
        return employeeService.saveEmployeeDetailsUniDirection(employeeModels);
    }
}
