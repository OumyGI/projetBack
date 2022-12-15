package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class SousCategories {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Code_SCategorie;
    private int image_SCategorie;
    private String Nom_SCategorie;
    @ManyToOne @JoinColumn(name="Code_Categorie")
    private Categorie categorie;


    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public int getCode_SCategorie() {
        return Code_SCategorie;
    }

    public void setCode_SCategorie(int code_SCategorie) {
        Code_SCategorie = code_SCategorie;
    }

    public int getImage_SCategorie() {
        return image_SCategorie;
    }

    public void setImage_SCategorie(int image_SCategorie) {
        this.image_SCategorie = image_SCategorie;
    }

    public String getNom_SCategorie() {
        return Nom_SCategorie;
    }

    public void setNom_SCategorie(String nom_SCategorie) {
        Nom_SCategorie = nom_SCategorie;
    }
    public SousCategories(){

    }

    public SousCategories(int code_SCategorie, int image_SCategorie, String nom_SCategorie, Categorie categorie) {
        Code_SCategorie = code_SCategorie;
        this.image_SCategorie = image_SCategorie;
        Nom_SCategorie = nom_SCategorie;
        this.categorie = categorie;
    }
}
