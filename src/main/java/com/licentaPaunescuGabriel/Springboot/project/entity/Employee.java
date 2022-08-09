package com.licentaPaunescuGabriel.Springboot.project.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
public class Employee implements Serializable {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;

    private Long userId;
    private String nume;
    private String prenume;

    private String email;
    private String varsta;
    private String functie;
    private int idSuperior;
    private long idMagazin;
    private float scorPerformanta;
    private long idArhiva;

    private String imageUrl;

    public String phone;

    private Date dataAngajare;

    public Employee() {
    }

    public Employee(long id, Long idUser, String nume, String prenume, String email, String varsta, String functie, int idSuperior, long idMagazin, float scorPerformanta, long idArhiva, Date dataAngajare, String imageUrl, String phone) {
        this.id = id;
        this.userId = idUser;
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.varsta = varsta;
        this.functie = functie;
        this.idSuperior = idSuperior;
        this.idMagazin = idMagazin;
        this.scorPerformanta = scorPerformanta;
        this.idArhiva = idArhiva;
        this.imageUrl=imageUrl;
        this.dataAngajare = dataAngajare;
        this.phone = phone;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getVarsta() {
        return varsta;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public int getIdSuperior() {
        return idSuperior;
    }

    public void setIdSuperior(int idSuperior) {
        this.idSuperior = idSuperior;
    }

    public long getIdMagazin() {
        return idMagazin;
    }

    public void setIdMagazin(long idMagazin) {
        this.idMagazin = idMagazin;
    }

    public float getScorPerformanta() {
        return scorPerformanta;
    }

    public void setScorPerformanta(float scorPerformanta) {
        this.scorPerformanta = scorPerformanta;
    }

    public long getIdArhiva() {
        return idArhiva;
    }

    public void setIdArhiva(long idArhiva) {
        this.idArhiva = idArhiva;
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl=imageUrl;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    public Date getDataAngajare() {
        return dataAngajare;
    }

    public void setDataAngajare(Date dataAngajare) {
        this.dataAngajare = dataAngajare;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", idUser=" + userId +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", email=" + email +
                ", varsta='" + varsta + '\'' +
                ", functie=" + functie +
                ", idSuperior=" + idSuperior +
                ", idMagazin=" + idMagazin +
                ", scorPerformanta=" + scorPerformanta +
                ", idArhiva=" + idArhiva +
                ", imageUrl =" + imageUrl +
                ", dataAngajare=" + dataAngajare +
                ", phone=" + phone +
                '}';
    }
}
