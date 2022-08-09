package com.licentaPaunescuGabriel.Springboot.project.error;

public class FormNotFoundException extends RuntimeException {
    public FormNotFoundException(String message) {
        super(message);
    }
}


