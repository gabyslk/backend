package com.licentaPaunescuGabriel.Springboot.project.repository;

import com.licentaPaunescuGabriel.Springboot.project.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    void deleteEmployeeByUserId(Long id);

    @Query(value = "SELECT * FROM employee e where e.id_user = ?", nativeQuery = true)
    Optional<Employee> findEmployeeByUserId(Long id);


}
