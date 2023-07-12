package com.simpleProject.simpleProjectCrudeOpretion.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lapId;
    private String laptopBrandName;
    private String laptopModels;
    private String laptopStore;
}
