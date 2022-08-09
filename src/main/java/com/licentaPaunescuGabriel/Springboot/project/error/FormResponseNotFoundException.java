package com.licentaPaunescuGabriel.Springboot.project.error;

import com.licentaPaunescuGabriel.Springboot.project.entity.FormResponse;

public class FormResponseNotFoundException extends RuntimeException {

    public FormResponseNotFoundException(String message) {
        super(message);
    }
}
