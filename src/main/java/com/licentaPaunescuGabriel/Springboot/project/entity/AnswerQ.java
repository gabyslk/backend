package com.licentaPaunescuGabriel.Springboot.project.entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Optional;


@Entity
public class AnswerQ {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;
    private int idQuestion;
    private String text;
    private float points;

    public AnswerQ(int id, int idQuestion, String text, float points) {
        this.id = id;
        this.idQuestion = idQuestion;
        this.text = text;
        this.points = points;
    }

    public AnswerQ() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public float getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "AnswerQ{" +
                "id=" + id +
                ", idQuestion=" + idQuestion +
                ", text='" + text + '\'' +
                ", points=" + points +
                '}';
    }
}
