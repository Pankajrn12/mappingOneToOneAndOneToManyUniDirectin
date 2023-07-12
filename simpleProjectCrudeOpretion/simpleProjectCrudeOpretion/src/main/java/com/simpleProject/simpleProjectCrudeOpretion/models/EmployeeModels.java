package com.simpleProject.simpleProjectCrudeOpretion.models;

import lombok.Data;

import java.util.List;

@Data
public class EmployeeModels {
    private Long empId;
    private String empName;
    private String empAddress;
    private String empEmail;
    private String empMobileNumbers;

    private List<AddressModel> addressModels;
}
