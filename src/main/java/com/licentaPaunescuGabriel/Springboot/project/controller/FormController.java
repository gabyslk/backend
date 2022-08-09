package com.licentaPaunescuGabriel.Springboot.project.controller;



import com.licentaPaunescuGabriel.Springboot.project.entity.Employee;
import com.licentaPaunescuGabriel.Springboot.project.entity.Form;
import com.licentaPaunescuGabriel.Springboot.project.entity.Question;
import com.licentaPaunescuGabriel.Springboot.project.service.EmployeeService;
import com.licentaPaunescuGabriel.Springboot.project.service.FormService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;

@RestController
@CrossOrigin
@RequestMapping("/forms")
public class FormController {

    private final FormService formService;




    public FormController(FormService formService) {
        this.formService = formService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Form>> getAllForms(){
        List<Form> forms = formService.findAllForms();
        return new ResponseEntity<>(forms, HttpStatus.OK);
    }

    @GetMapping("/find/{idTip}")
    public ResponseEntity<Form> findFormByIdTip(@PathVariable("idTip") int idTip){
        Form form = formService.findFormByIdTip(idTip);
        return new ResponseEntity<>(form, HttpStatus.OK);
    }

    @GetMapping("/getListOfQuestionIdByIdTip/{idTip}")
    public ResponseEntity<List<Integer>> getListOfQuestionByForm(@PathVariable("idTip") int idTip) {
        List<Integer> questionList = formService.getListOfQuestionByIdTip(idTip);
        return new ResponseEntity<>(questionList, HttpStatus.OK);
    }


}
