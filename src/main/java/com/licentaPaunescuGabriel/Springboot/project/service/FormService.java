package com.licentaPaunescuGabriel.Springboot.project.service;
import com.licentaPaunescuGabriel.Springboot.project.entity.Form;

import com.licentaPaunescuGabriel.Springboot.project.error.FormNotFoundException;
import com.licentaPaunescuGabriel.Springboot.project.repository.EmployeeRepository;
import com.licentaPaunescuGabriel.Springboot.project.repository.FormRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormService {

    @Autowired
    private final FormRepository formRepo;


    public FormService(FormRepository formRepo) {

        this.formRepo = formRepo;

    }


    public List<Form> findAllForms() {
        return formRepo.findAll();
    }

    public Form findFormByIdTip(int id) {
        return formRepo.findFormByIdTip(id).orElseThrow(() -> new FormNotFoundException("The form with the tipe" + id + "was not found!"));
    }


    public List<Integer> getListOfQuestionByIdTip(int idTip) {

         Optional<Form> form= formRepo.findFormByIdTip(idTip);
        List<Integer> listOfQuestions = form.get().getQuestionIdsAsList();

        return listOfQuestions;

    }

}
