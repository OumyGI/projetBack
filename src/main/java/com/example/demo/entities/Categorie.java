package com.example.demo.entities;

import javax.persistence.*;
import java.util.Collection;



@Entity
public class Categorie  {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Code_Categorie;
    private int image_categorie;
    private String Nom_Categorie;
    @OneToMany(mappedBy = "categorie",fetch = FetchType.LAZY)
    private Collection<SousCategories> sousCategories;

    public int getCode_Categorie() {
        return Code_Categorie;
    }

    public void setCode_Categorie(int code_Categorie) {
        Code_Categorie = code_Categorie;
    }

    public int getImage_categorie() {
        return image_categorie;
    }

    public void setImage_categorie(int image_categorie) {
        this.image_categorie = image_categorie;
    }

    public String getNom_Categorie() {
        return Nom_Categorie;
    }

    public void setNom_Categorie(String nom_Categorie) {
        Nom_Categorie = nom_Categorie;
    }

    public Categorie(int code_Categorie, int image_categorie, String nom_Categorie, Collection<SousCategories> sousCategories) {

        Code_Categorie = code_Categorie;
        this.image_categorie = image_categorie;
        Nom_Categorie = nom_Categorie;
        this.sousCategories = sousCategories;
    }
    public Categorie(){

    }
}
