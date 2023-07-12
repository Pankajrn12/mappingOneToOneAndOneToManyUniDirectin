package com.simpleProject.simpleProjectCrudeOpretion.models;

import lombok.Data;

@Data
public class StudentModel {
    public Long stdId;
    private String studentName;
    private String studentAddress;
    private String studentMobileNumbers;
    private String studentEmail;
    private LaptopModel laptopModel;
}
