package com.licentaPaunescuGabriel.Springboot.project.repository;

import com.licentaPaunescuGabriel.Springboot.project.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentName(String departmentName);

    @Query(value = "SELECT TOP 1 * FROM DEPARTMENT WHERE DEPARTMENT_NAME LIKE '%?1%'", nativeQuery = true)
    Department findByDepartmentNameIgnoreCase(String departmentName);


}
