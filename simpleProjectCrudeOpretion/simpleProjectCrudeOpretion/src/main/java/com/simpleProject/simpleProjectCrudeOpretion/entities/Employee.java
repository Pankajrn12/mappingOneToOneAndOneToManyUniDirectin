package com.simpleProject.simpleProjectCrudeOpretion.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;
    private String empName;
    private String empAddress;
    private String empEmail;
    private String empMobileNumbers;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> addresses;

}
