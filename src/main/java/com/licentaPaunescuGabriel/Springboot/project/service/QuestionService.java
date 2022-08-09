package com.licentaPaunescuGabriel.Springboot.project.service;

import com.licentaPaunescuGabriel.Springboot.project.entity.Question;
import com.licentaPaunescuGabriel.Springboot.project.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    @Autowired
    private final QuestionRepository questionRepository;

    private final FormService formService;


    public QuestionService(QuestionRepository questionRepository, FormService formService) {

        this.questionRepository = questionRepository;
        this.formService = formService;
    }
    public Question findQuestionById(int id){
        return questionRepository.findQuestionById(id).orElseThrow();
    }
    public Question findTextByQuestionId(int id) {
        return questionRepository.findTextByQuestionId(id).orElseThrow();
    }

    public List<Optional<Question>> findQuestionsByIdTip(int idTip) {
        List<Optional<Question>> listOfQuestionObjects = new ArrayList<Optional<Question>>();
        List<Integer> listOfQuestionIds =formService.getListOfQuestionByIdTip(idTip);
        Optional<Question> q;
        for(int i=0;i< listOfQuestionIds.size();i++){
            q = questionRepository.findQuestionById(listOfQuestionIds.get(i));
            listOfQuestionObjects.add(q);
        }

        return listOfQuestionObjects;
    }


//    public List<Question> findQuestionsByIdTip(int idTip) {
//        return questionRepository.findQuestionsByIdTip(idTip);
//    }
}
