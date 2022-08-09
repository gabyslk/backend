package com.licentaPaunescuGabriel.Springboot.project.controller;

import com.licentaPaunescuGabriel.Springboot.project.entity.Department;
import com.licentaPaunescuGabriel.Springboot.project.error.DepartmentNotFoundException;
import com.licentaPaunescuGabriel.Springboot.project.service.DepartmentService;
import com.licentaPaunescuGabriel.Springboot.project.service.DepartmentServiceImpl;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class DepartmentControler {

    @Autowired
    private DepartmentService departmentService;

    private final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(DepartmentControler.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Inside saveDepartment of DepartmenntController");
        return departmentService.saveDepartment(department);


    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        LOGGER.info("Inside fetchDepartment of DepartmenntController");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted succesfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
        return departmentService.updateDepartment(departmentId, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }
}
