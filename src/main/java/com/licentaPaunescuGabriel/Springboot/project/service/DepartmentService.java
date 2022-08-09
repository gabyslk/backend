package com.licentaPaunescuGabriel.Springboot.project.service;

import com.licentaPaunescuGabriel.Springboot.project.entity.Department;
import com.licentaPaunescuGabriel.Springboot.project.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
     public Department saveDepartment(Department department);

     public List<Department> fetchDepartmentList();

     Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

     public void deleteDepartmentById(Long departmentId);

     public Department updateDepartment(Long departmentId, Department department);

     public Department fetchDepartmentByName(String departmentName);
}
