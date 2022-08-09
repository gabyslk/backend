package com.licentaPaunescuGabriel.Springboot.project.controller;





import com.licentaPaunescuGabriel.Springboot.project.entity.Employee;
import com.licentaPaunescuGabriel.Springboot.project.entity.Form;
import com.licentaPaunescuGabriel.Springboot.project.entity.FormResponse;
import com.licentaPaunescuGabriel.Springboot.project.service.FormResponseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@CrossOrigin
@RequestMapping("/formsResponse")
public class FormResponseController {

    private final FormResponseService formResponseService;

    public FormResponseController(FormResponseService formResponseService) {
        this.formResponseService = formResponseService;
    }

    @GetMapping("/find/{userId}")
    public ResponseEntity<FormResponse> findFormByUserId(@PathVariable("userId") int userId){
        FormResponse formResponse = formResponseService.findFormResponseByUserId(userId);
        return new ResponseEntity<>(formResponse, HttpStatus.OK);
    }

    @PostMapping("/send")
    public ResponseEntity<FormResponse> sendFormResponse(@RequestBody FormResponse fResponse){
        FormResponse formResponse = formResponseService.sendFormResponse(fResponse);
        return new ResponseEntity<>(formResponse, HttpStatus.CREATED);
    }

    @PutMapping("/review")
    public ResponseEntity<FormResponse> reviewFormResponse(@RequestBody FormResponse fResponse){
        FormResponse formResponse = formResponseService.reviewFormResponse(fResponse);
        return new ResponseEntity<>(formResponse, HttpStatus.OK);
    }
}
