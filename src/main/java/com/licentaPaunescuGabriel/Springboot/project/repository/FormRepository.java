package com.licentaPaunescuGabriel.Springboot.project.repository;

import com.licentaPaunescuGabriel.Springboot.project.entity.Employee;
import com.licentaPaunescuGabriel.Springboot.project.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface FormRepository extends JpaRepository<Form, Integer> {

//    void deleteEmployeeByUserId(Long id);
//
//    @Query(value = "SELECT * FROM employee e where e.id_user = ?", nativeQuery = true)
//    Optional<Employee> findEmployeeByUserId(Long id);

    Optional<Form> findFormById(int id);

    @Query(value = "SELECT * FROM Form", nativeQuery = true)
    List<Form> findAll();

    Optional<Form> findFormByIdTip(int idTip);

    @Query(value = "SELECT id_question1, id_question2, id_question3, id_question4, id_question5, id_question6,id_question7,id_question8,id_question9,id_question10 FROM form WHERE id_tip=?1", nativeQuery = true)
    List<Integer> getListOfQuestionIdByIdTip(int idTip);
}
