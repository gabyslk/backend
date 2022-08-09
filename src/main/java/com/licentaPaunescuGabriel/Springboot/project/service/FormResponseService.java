package com.licentaPaunescuGabriel.Springboot.project.service;

import com.licentaPaunescuGabriel.Springboot.project.entity.FormResponse;
import com.licentaPaunescuGabriel.Springboot.project.error.FormNotFoundException;
import com.licentaPaunescuGabriel.Springboot.project.error.FormResponseNotFoundException;
import com.licentaPaunescuGabriel.Springboot.project.repository.AnswerQRepo;
import com.licentaPaunescuGabriel.Springboot.project.repository.FormResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormResponseService {

    @Autowired
    private final FormResponseRepository formResponseRepo;

    @Autowired
    private final AnswerQRepo answerQResponseRepo;

    public FormResponseService(FormResponseRepository formResponseRepo, AnswerQRepo answerQResponseRepo) {
        this.formResponseRepo = formResponseRepo;
        this.answerQResponseRepo= answerQResponseRepo;
    }


    public FormResponse findFormResponseByUserId(int userId) {
        return formResponseRepo.findFormResponseByUserId(userId).orElseThrow(() -> new FormResponseNotFoundException("The form with the user id" + userId + "was not found!"));
    }

    public FormResponse sendFormResponse(FormResponse fResponse) {
        return formResponseRepo.save(fResponse);
    }


    public FormResponse reviewFormResponse(FormResponse fResponse) {
        Optional<FormResponse> formResponse = formResponseRepo.findFormResponseByUserId(fResponse.getUserId());
        List<Integer> responsesAsList = fResponse.toArray(fResponse.getResponses());
        float score = 0;
        float responsePoints = 0;
        int responseId = 0;
        int i = 0;
        while (i < responsesAsList.size()) {
            responsePoints = answerQResponseRepo.getPointsById(responsesAsList.get(i));
            score += responsePoints;
            i++;
        }

        formResponseRepo.updateScoreByFormResponseId(score, fResponse.getId());
        return formResponseRepo.findFormResponseById(fResponse.getId()).orElseThrow(()-> new FormResponseNotFoundException("The Form was not found!"));
    }







}

