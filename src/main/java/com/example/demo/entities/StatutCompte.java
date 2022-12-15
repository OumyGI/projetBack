package com.example.demo.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class StatutCompte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Statut;
    private String statut;
    private Date dateCreation;
    private Date DateBlockage;
    private Date dateSupression;
    @OneToOne(mappedBy = "statutcompte")
    private Compte compte;

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public int getId_Statut() {
        return id_Statut;
    }

    public void setId_Statut(int id_Statut) {
        this.id_Statut = id_Statut;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateBlockage() {
        return DateBlockage;
    }

    public void setDateBlockage(Date dateBlockage) {
        DateBlockage = dateBlockage;
    }

    public Date getDateSupression() {
        return dateSupression;
    }

    public void setDateSupression(Date dateSupression) {
        this.dateSupression = dateSupression;
    }
    public StatutCompte(){

    }

    public StatutCompte(int id_Statut, String statut, Date dateCreation, Date dateBlockage, Date dateSupression, Compte compte) {
        this.id_Statut = id_Statut;
        this.statut = statut;
        this.dateCreation = dateCreation;
        DateBlockage = dateBlockage;
        this.dateSupression = dateSupression;
        this.compte = compte;
    }
}