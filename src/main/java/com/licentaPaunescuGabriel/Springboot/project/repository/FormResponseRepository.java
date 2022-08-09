package com.licentaPaunescuGabriel.Springboot.project.repository;

import com.licentaPaunescuGabriel.Springboot.project.entity.Employee;
import com.licentaPaunescuGabriel.Springboot.project.entity.Form;
import com.licentaPaunescuGabriel.Springboot.project.entity.FormResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface FormResponseRepository extends JpaRepository<FormResponse, Integer> {

    Optional<FormResponse> findFormResponseById(int id);

    Optional<FormResponse>findFormResponseByUserId(long userId);

//    Optional<FormResponse> findScorByRaspuns(int id);
    @Transactional
    @Modifying
    @Query(value = "UPDATE form_response fr SET score=?1 where fr.id=?2",nativeQuery = true)
    void updateScoreByFormResponseId(float score,int id);

//    @Query (aici o sa apelez procedura de review in cazul in care fac asa)
//   Optional<FormResponse> reviewFormResponse(FormResponse fResponse);
}
