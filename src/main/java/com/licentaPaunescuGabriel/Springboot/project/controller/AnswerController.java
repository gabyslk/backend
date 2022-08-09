package com.licentaPaunescuGabriel.Springboot.project.controller;
import com.licentaPaunescuGabriel.Springboot.project.entity.AnswerQ;
import com.licentaPaunescuGabriel.Springboot.project.entity.Employee;
import com.licentaPaunescuGabriel.Springboot.project.entity.Question;
import com.licentaPaunescuGabriel.Springboot.project.service.AnswerQSerivce;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/answer")
public class AnswerController {

    private final AnswerQSerivce answerQSerivce;

    public AnswerController(AnswerQSerivce answerQSerivce) {
        this.answerQSerivce = answerQSerivce;
    }

    @GetMapping("/find/{idQuestion}")
    public ResponseEntity<List<AnswerQ>> findAllAnswersByIdQuestion(@PathVariable("idQuestion") int idQuestion){
        List<AnswerQ> answerQList = answerQSerivce.findAllAnswersByIdQuestion(idQuestion);
        return new ResponseEntity<>(answerQList, HttpStatus.OK);
    }

    @GetMapping("/findBySelectedValue/{idQuestion}/{selectedValue}")
    public ResponseEntity<Optional<AnswerQ>> findAnswerByIdQuestionAndSelectedValue(@PathVariable("idQuestion") int idQuestion,
                                                                          @PathVariable("selectedValue") int selectedValue){
        Optional<AnswerQ> answerQ = answerQSerivce.findAnswerByIdQuestionAndSelectedValue(idQuestion, selectedValue);
        return new ResponseEntity<>(answerQ,HttpStatus.OK);
    }

}
