package com.licentaPaunescuGabriel.Springboot.project.service;

import com.licentaPaunescuGabriel.Springboot.project.entity.Employee;
import com.licentaPaunescuGabriel.Springboot.project.error.UserNotFoundException;
import com.licentaPaunescuGabriel.Springboot.project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private final EmployeeRepository employeeRepo;


    public EmployeeService(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteEmployeeByUserId(id);
    }

    public Employee findEmployeeByUserId(Long id) {
        return employeeRepo.findEmployeeByUserId(id).orElseThrow(() -> new UserNotFoundException("The employee with the id" + id + "was not found"));
    }
}


