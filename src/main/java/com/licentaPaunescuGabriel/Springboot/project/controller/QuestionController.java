package com.licentaPaunescuGabriel.Springboot.project.controller;


import com.licentaPaunescuGabriel.Springboot.project.entity.Question;
import com.licentaPaunescuGabriel.Springboot.project.service.QuestionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/question")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }


    //    @GetMapping("/find/{userId}")
//    public ResponseEntity<FormResponse> findFormByUserId(@PathVariable("userId") int userId){
//        FormResponse formResponse = formResponseService.findFormResponseByUserId(userId);
//        return new ResponseEntity<>(formResponse, HttpStatus.OK);
    @GetMapping("/{id}")
    public ResponseEntity<Question> findTextByQuestionId(@PathVariable("id") int id) {
        Question questionText = questionService.findTextByQuestionId(id);
        return new ResponseEntity<>(questionText, HttpStatus.OK);
    }

    @GetMapping("/findQuestions/{idTipForm}")
    public ResponseEntity<List<Optional<Question>>> findQuestionsByIdTip(@PathVariable("idTipForm") int idTip) {
        List<Optional<Question>> questionList = questionService.findQuestionsByIdTip(idTip);
        return new ResponseEntity<>(questionList, HttpStatus.OK);
    }
}
