package com.example.demo.entities;

import javax.persistence.*;
import java.util.Collection;


@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_client;
    private int ImgProfile;
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String ville;
    private String tel;
    @ManyToMany(
            fetch=FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy="clients"
    )
    private Collection<coupon> coupons;
    
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    private Collection<Commande> commandes;
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    private Collection<Livraison> livraisons;
    @OneToOne(mappedBy = "client")
    private Compte compte;

    public int getId_client() {
        return Id_client;
    }

    public void setId_client(int id_client) {
        Id_client = id_client;
    }

    public int getImgProfile() {
        return ImgProfile;
    }

    public void setImgProfile(int imgProfile) {
        ImgProfile = imgProfile;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Collection<coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(Collection<coupon> coupons) {
        this.coupons = coupons;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }

    public Collection<Livraison> getLivraisons() {
        return livraisons;
    }

    public void setLivraisons(Collection<Livraison> livraisons) {
        this.livraisons = livraisons;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Client(int imgProfile, String nom, String prenom, String email, String adresse, String ville, String tel, Collection<coupon> coupons, Collection<Commande> commandes, Collection<Livraison> livraisons, Compte compte) {
        ImgProfile = imgProfile;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.ville = ville;
        this.tel = tel;
        this.coupons = coupons;
        this.commandes = commandes;
        this.livraisons = livraisons;
        this.compte = compte;
    }

    public Client() {
    }
}
