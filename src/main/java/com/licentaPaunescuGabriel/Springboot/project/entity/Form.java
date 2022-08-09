package com.licentaPaunescuGabriel.Springboot.project.entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
public class Form {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;
    private int idTip;
    private int idQuestion1;
    private int idQuestion2;
    private int idQuestion3;
    private int idQuestion4;
    private int idQuestion5;
    private int idQuestion6;
    private int idQuestion7;
    private int idQuestion8;
    private int idQuestion9;
    private int idQuestion10;


    public Form(int id, int idTip, int idQuestion1, int idQuestion2, int idQuestion3, int idQuestion4, int idQuestion5, int idQuestion6, int idQuestion7, int idQuestion8, int idQuestion9, int idQuestion10) {
        this.id = id;
        this.idTip = idTip;
        this.idQuestion1 = idQuestion1;
        this.idQuestion2 = idQuestion2;
        this.idQuestion3 = idQuestion3;
        this.idQuestion4 = idQuestion4;
        this.idQuestion5 = idQuestion5;
        this.idQuestion6 = idQuestion6;
        this.idQuestion7 = idQuestion7;
        this.idQuestion8 = idQuestion8;
        this.idQuestion9 = idQuestion9;
        this.idQuestion10 = idQuestion10;
    }

    public Form() {

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

    public int getIdQuestion1() {
        return idQuestion1;
    }

    public void setIdQuestion1(int idQuestion1) {
        this.idQuestion1 = idQuestion1;
    }

    public int getIdQuestion2() {
        return idQuestion2;
    }

    public void setIdQuestion2(int idQuestion2) {
        this.idQuestion2 = idQuestion2;
    }

    public int getIdQuestion3() {
        return idQuestion3;
    }

    public void setIdQuestion3(int idQuestion3) {
        this.idQuestion3 = idQuestion3;
    }

    public int getIdQuestion4() {
        return idQuestion4;
    }

    public void setIdQuestion4(int idQuestion4) {
        this.idQuestion4 = idQuestion4;
    }

    public int getIdQuestion5() {
        return idQuestion5;
    }

    public void setIdQuestion5(int idQuestion5) {
        this.idQuestion5 = idQuestion5;
    }

    public int getIdQuestion6() {
        return idQuestion6;
    }

    public void setIdQuestion6(int idQuestion6) {
        this.idQuestion6 = idQuestion6;
    }

    public int getIdQuestion7() {
        return idQuestion7;
    }

    public void setIdQuestion7(int idQuestion7) {
        this.idQuestion7 = idQuestion7;
    }

    public int getIdQuestion8() {
        return idQuestion8;
    }

    public void setIdQuestion8(int idQuestion8) {
        this.idQuestion8 = idQuestion8;
    }

    public int getIdQuestion9() {
        return idQuestion9;
    }

    public void setIdQuestion9(int idQuestion9) {
        this.idQuestion9 = idQuestion9;
    }

    public int getIdQuestion10() {
        return idQuestion10;
    }

    public void setIdQuestion10(int idQuestion10) {
        this.idQuestion10 = idQuestion10;
    }

    @Override
    public String toString() {
        return "Form{" +
                "id=" + id +
                ", idTip=" + idTip +
                ", idQuestion1=" + idQuestion1 +
                ", idQuestion2=" + idQuestion2 +
                ", idQuestion3=" + idQuestion3 +
                ", idQuestion4=" + idQuestion4 +
                ", idQuestion5=" + idQuestion5 +
                ", idQuestion6=" + idQuestion6 +
                ", idQuestion7=" + idQuestion7 +
                ", idQuestion8=" + idQuestion8 +
                ", idQuestion9=" + idQuestion9 +
                ", idQuestion10=" + idQuestion10 +
                '}';
    }

    public List<Integer> getQuestionIdsAsList(){
        List<Integer> listOfQuestionIds = new ArrayList<Integer>();
        listOfQuestionIds.add(this.idQuestion1);
        listOfQuestionIds.add(this.idQuestion2);
        listOfQuestionIds.add(this.idQuestion3);
        listOfQuestionIds.add(this.idQuestion4);
        listOfQuestionIds.add(this.idQuestion5);
        listOfQuestionIds.add(this.idQuestion6);
        listOfQuestionIds.add(this.idQuestion7);
        listOfQuestionIds.add(this.idQuestion8);
        listOfQuestionIds.add(this.idQuestion9);
        listOfQuestionIds.add(this.idQuestion10);

        return listOfQuestionIds;
    }
}
