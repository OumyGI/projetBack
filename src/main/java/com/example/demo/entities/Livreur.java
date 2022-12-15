package com.example.demo.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Livreur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  Id_Livreur;
    private String nom_livreur;
    private String prenom_Livreur ;
    private String Email_Livreur;
    private String Address_Livreur;
    private String tel_livreur ;
    @OneToMany(mappedBy = "livreur",fetch = FetchType.LAZY)
    private Collection<Livraison> livraisons;

    public int getId_Livreur() {
        return Id_Livreur;
    }

    public void setId_Livreur(int id_Livreur) {
        Id_Livreur = id_Livreur;
    }

    public String getNom_livreur() {
        return nom_livreur;
    }

    public void setNom_livreur(String nom_livreur) {
        this.nom_livreur = nom_livreur;
    }

    public String getPrenom_Livreur() {
        return prenom_Livreur;
    }

    public void setPrenom_Livreur(String prenom_Livreur) {
        this.prenom_Livreur = prenom_Livreur;
    }

    public String getEmail_Livreur() {
        return Email_Livreur;
    }

    public void setEmail_Livreur(String email_Livreur) {
        Email_Livreur = email_Livreur;
    }

    public String getAddress_Livreur() {
        return Address_Livreur;
    }

    public void setAddress_Livreur(String address_Livreur) {
        Address_Livreur = address_Livreur;
    }

    public String getTel_livreur() {
        return tel_livreur;
    }

    public void setTel_livreur(String tel_livreur) {
        this.tel_livreur = tel_livreur;
    }

    public Collection<Livraison> getLivraisons() {
        return livraisons;
    }

    public void setLivraisons(Collection<Livraison> livraisons) {
        this.livraisons = livraisons;
    }
    public Livreur(){

    }

    public Livreur(int id_Livreur, String nom_livreur, String prenom_Livreur, String email_Livreur, String address_Livreur, String tel_livreur, Collection<Livraison> livraisons) {
        Id_Livreur = id_Livreur;
        this.nom_livreur = nom_livreur;
        this.prenom_Livreur = prenom_Livreur;
        Email_Livreur = email_Livreur;
        Address_Livreur = address_Livreur;
        this.tel_livreur = tel_livreur;
        this.livraisons = livraisons;
    }
}
