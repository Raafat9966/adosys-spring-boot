package com.example.adosysspringboot.repository;

import com.example.adosysspringboot.entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
