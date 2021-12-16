package com.example.adosysspringboot.service;

import com.example.adosysspringboot.entity.Employee;
import com.example.adosysspringboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getEmployee(final Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found" + id));
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee( final Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(final Long id) {
        employeeRepository.deleteById(id);
    }

}
