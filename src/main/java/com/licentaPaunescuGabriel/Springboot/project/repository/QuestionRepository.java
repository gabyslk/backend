package com.licentaPaunescuGabriel.Springboot.project.repository;

import com.licentaPaunescuGabriel.Springboot.project.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Integer> {


    Optional<Question> findQuestionById(int id);

    @Query(value = "SELECT * FROM Question q WHERE id =?1",nativeQuery = true)
    Optional<Question> findTextByQuestionId(int id);

//    @Query(value="SELECT * FROM Question q WHERE ")
//    List<Question> findQuestionsByIdTip(int idTip);
}
