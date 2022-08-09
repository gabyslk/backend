package com.licentaPaunescuGabriel.Springboot.project.service;
import com.licentaPaunescuGabriel.Springboot.project.entity.AnswerQ;
import com.licentaPaunescuGabriel.Springboot.project.repository.AnswerQRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerQSerivce {

    @Autowired private final AnswerQRepo answerQRepo;


    public AnswerQSerivce(AnswerQRepo answerQRepo) {
        this.answerQRepo = answerQRepo;
    }

    public AnswerQ findAnswerQByidQuestionAndText(int idQuestion, String text){
        return answerQRepo.findAnswerQByIdQuestionAndText(idQuestion,text);
    }

    public List<AnswerQ> findAllAnswersByIdQuestion(int idQuestion){
        return answerQRepo.findAllAnswersByIdQuestion(idQuestion);
    }

    public Optional<AnswerQ> findAnswerByIdQuestionAndSelectedValue(int idQuestion, int selectedValue) {
        List<AnswerQ> answers = answerQRepo.findAllAnswersByIdQuestion(idQuestion);
        for(int i=0;i<answers.size();i++){
            String interval=answers.get(i).getText();
            interval = interval.replace(" ","");
            interval=interval.replace("-","");
            int a = Character.getNumericValue(interval.charAt(0));
            int b=Character.getNumericValue(interval.charAt(1));
            if(selectedValue >= a && selectedValue <= b){
                return answerQRepo.findAnswerQById(answers.get(i).getId());
            }
        }
        return null;
    }
}
