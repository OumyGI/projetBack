package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class Compte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Compte;
    private String username;
    private String mdp;
    @OneToOne
    private Client client;
    @OneToOne
    private StatutCompte statutcompte;
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public StatutCompte getStatutcompte() {
        return statutcompte;
    }

    public void setStatutcompte(StatutCompte statutcompte) {
        this.statutcompte = statutcompte;
    }

    public int getId_Compte() {
        return id_Compte;
    }

    public void setId_Compte(int id_Compte) {
        this.id_Compte = id_Compte;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    public Compte(){

    }

    public Compte(int id_Compte, String username, String mdp, Client client, StatutCompte statutcompte) {
        this.id_Compte = id_Compte;
        this.username = username;
        this.mdp = mdp;
        this.client = client;
        this.statutcompte = statutcompte;
    }
}
