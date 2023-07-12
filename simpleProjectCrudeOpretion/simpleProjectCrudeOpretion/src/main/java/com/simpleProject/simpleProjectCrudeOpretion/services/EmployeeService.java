package com.simpleProject.simpleProjectCrudeOpretion.services;

import com.simpleProject.simpleProjectCrudeOpretion.entities.Address;
import com.simpleProject.simpleProjectCrudeOpretion.entities.Employee;
import com.simpleProject.simpleProjectCrudeOpretion.models.EmployeeModels;
import com.simpleProject.simpleProjectCrudeOpretion.repositories.EmployeeReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeReposity employeeReposity;

    @Transactional
    public ResponseEntity saveEmployeeDetailsUniDirection(EmployeeModels employeeModels) {
        Employee employee = new Employee();
        employee.setEmpId(employeeModels.getEmpId());
        employee.setEmpName(employeeModels.getEmpName());
        employee.setEmpAddress(employeeModels.getEmpAddress());
        employee.setEmpEmail(employeeModels.getEmpEmail());
        employee.setEmpMobileNumbers(employeeModels.getEmpMobileNumbers());

        List<Address> addList = new ArrayList<>();
        employeeModels.getAddressModels().stream().forEach(data->{
            Address address = new Address();
            address.setPermanentAddress(data.getPermanentAddress());
            address.setCurrentAddress(data.getCurrentAddress());
            addList.add(address);
        });
        employee.setAddresses(addList);
        employeeReposity.save(employee);
        return new ResponseEntity<>("Saved employee Details", HttpStatus.OK);
    }
}
