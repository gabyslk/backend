package com.licentaPaunescuGabriel.Springboot.project.entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.*;


@Entity

public class FormResponse {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;

    private int idForm;

    private int idTip;

    private long userId;

    private String responses;

    private float score;

    public FormResponse(int id, int idForm, int idTip, long userId, String responses, float score) {
        this.id = id;
        this.idForm = idForm;
        this.idTip = idTip;
        this.userId = userId;
        this.responses = responses;
        this.score=score;

    }

    public FormResponse() {

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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getResponses() {
        return responses;
    }

    public void setResponses(String responses) {
        this.responses = responses;
    }

    public float getScore() {
        return score;
    }

    public int getIdForm() {
        return idForm;
    }

    public void setIdForm(int idForm) {
        this.idForm = idForm;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "FormResponse{" +
                "id=" + id +
                ", idForm=" + idForm +
                ", idTip=" + idTip +
                ", userId=" + userId +
                ", responses=" + responses +
                ", score=" + score +
                '}';
    }

    public List<Integer> toArray(String responses){
        String[] convertedResponsesArray = this.responses.split(",");
        List<Integer> ConvertedResponsesArray = new ArrayList<Integer>();
        for (String number : convertedResponsesArray) {
            ConvertedResponsesArray.add(Integer.parseInt(number.trim()));
        }

        return ConvertedResponsesArray;
    }


}
