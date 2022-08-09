package com.licentaPaunescuGabriel.Springboot.project.repository;
import com.licentaPaunescuGabriel.Springboot.project.entity.AnswerQ;
import com.licentaPaunescuGabriel.Springboot.project.entity.Employee;
import com.licentaPaunescuGabriel.Springboot.project.entity.Form;
import com.licentaPaunescuGabriel.Springboot.project.entity.FormResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface AnswerQRepo extends JpaRepository<AnswerQ, Integer> {


    Optional<AnswerQ> findAnswerQById(int id);


    Optional<AnswerQ> findAnswerQByText(String text);

    @Query(value = "SELECT * FROM AnswerQ a WHERE a.id_question=?1", nativeQuery = true)
    List<AnswerQ> findAllAnswersByIdQuestion(int idQuestion);

    @Query(value = "SELECT Points FROM AnswerQ a where a.id=?1", nativeQuery = true)
    int getPointsById(int raspunsq1);

    @Query(value="SELECT * FROM AnswerQ a where a.id_question=?1 and a.text =?2", nativeQuery = true)
    AnswerQ findAnswerQByIdQuestionAndText(int idQuestion, String text);


}
