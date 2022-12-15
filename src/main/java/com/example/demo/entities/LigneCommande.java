package com.example.demo.entities;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Collection;

@Entity
public class LigneCommande implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_LigneCmd;

  
    private int  Qte;
    
    @ManyToOne@JoinColumn(name="id_produit")
    private Produit produit;
  
    @ManyToOne@JoinColumn(name="ref_cmd")
    private Commande commande;
    
   

    public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public int getId_LigneCmd() {
        return id_LigneCmd;
    }

    public void setId_LigneCmd(int id_LigneCmd) {
        this.id_LigneCmd = id_LigneCmd;
    }

    public int getQte() {
        return Qte;
    }

    public void setQte(int qte) {
        Qte = qte;
    }

  

    public LigneCommande(int id_LigneCmd, int qte, Produit produit, Commande commande) {
		super();
		this.id_LigneCmd = id_LigneCmd;
		Qte = qte;
		this.produit = produit;
		this.commande = commande;
	}

	public LigneCommande(){

    }


}
