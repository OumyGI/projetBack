package com.example.demo.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Livraison {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_livraison;
    private Date date_livraison;
    private float montant_total_livraison;
    @ManyToOne @JoinColumn(name="Id_client")
    private Client client;
    @ManyToOne @JoinColumn(name="Id_Livreur")
    private Livreur livreur;
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Livreur getLivreur() {
        return livreur;
    }

    public void setLivreur(Livreur livreur) {
        this.livreur = livreur;
    }

    public int getId_livraison() {
        return id_livraison;
    }

    public void setId_livraison(int id_livraison) {
        this.id_livraison = id_livraison;
    }

    public Date getDate_livraison() {
        return date_livraison;
    }

    public void setDate_livraison(Date date_livraison) {
        this.date_livraison = date_livraison;
    }

    public float getMontant_total_livraison() {
        return montant_total_livraison;
    }

    public void setMontant_total_livraison(float montant_total_livraison) {
        this.montant_total_livraison = montant_total_livraison;
    }
    public Livraison(){

    }

    public Livraison(int id_livraison, Date date_livraison, float montant_total_livraison, Client client, Livreur livreur) {
        this.id_livraison = id_livraison;
        this.date_livraison = date_livraison;
        this.montant_total_livraison = montant_total_livraison;
        this.client = client;
        this.livreur = livreur;
    }
}
