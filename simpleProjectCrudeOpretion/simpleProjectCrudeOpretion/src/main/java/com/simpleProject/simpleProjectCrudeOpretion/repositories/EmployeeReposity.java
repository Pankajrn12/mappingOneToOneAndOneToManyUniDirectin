package com.simpleProject.simpleProjectCrudeOpretion.repositories;

import com.simpleProject.simpleProjectCrudeOpretion.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeReposity  extends JpaRepository<Employee, Long> {
}
