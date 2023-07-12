package com.simpleProject.simpleProjectCrudeOpretion.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long stdId;
    private String studentName;
    private String studentAddress;
    private String studentMobileNumbers;
    private String studentEmail;

    @OneToOne(cascade = CascadeType.ALL)
    private Laptop laptop;

}
