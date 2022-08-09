package com.licentaPaunescuGabriel.Springboot.project.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;

    private int idTip;

    private String text;

    private int idIndicator;

    public Question() {
    }

    public Question(int id, int idTip, String text, int idIndicator) {
        this.id = id;
        this.idTip = idTip;
        this.text = text;
        this.idIndicator = idIndicator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTip() {
        return idTip;
    }

    public void setIdTip(int idTip) {
        this.idTip = idTip;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIdIndicator() {
        return idIndicator;
    }

    public void setIdIndicator(int idIndicator) {
        this.idIndicator = idIndicator;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", idTip=" + idTip +
                ", text='" + text + '\'' +
                ", idIndicator=" + idIndicator +
                '}';
    }
}
