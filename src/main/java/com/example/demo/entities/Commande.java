package com.example.demo.entities;

import javax.persistence.*;

import java.util.Collection;
import java.util.Date;

@Entity
public class Commande {
    @Id 
    private String ref_cmd;
    private String Address_Livraison;
    private Date delai_livraison;
    private float Montant_cmd;
    private String  etat_cmd;
    private Date date_cmd;
    private int  nbItems; 
    private boolean ItemProcessed;
    @ManyToOne @JoinColumn(name="Id_client")
    private Client client;
    
    @OneToMany(mappedBy = "commande",fetch = FetchType.LAZY)
    private Collection<LigneCommande> lignesCommandes;
    
    public Commande(String ref_cmd, String address_Livraison, Date delai_livraison, float montant_cmd, String etat_cmd,
			Date date_cmd, int nbItems, boolean itemProcessed, Collection<LigneCommande> lignesCommandes,
			Client client) {
		super();
		this.ref_cmd = ref_cmd;
		Address_Livraison = address_Livraison;
		this.delai_livraison = delai_livraison;
		Montant_cmd = montant_cmd;
		this.etat_cmd = etat_cmd;
		this.date_cmd = date_cmd;
		this.nbItems = nbItems;
		ItemProcessed = itemProcessed;
		this.lignesCommandes = lignesCommandes;
		this.client = client;
	}

	public Collection<LigneCommande> getLignesCommandes() {
		return lignesCommandes;
	}

	public void setLignesCommandes(Collection<LigneCommande> lignesCommandes) {
		this.lignesCommandes = lignesCommandes;
	}

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public Commande(String ref_cmd, Date delai_livraison, String address_Livraison, float montant_cmd, String etat_cmd,
			Date date_cmd, int nbItems, boolean itemProcessed, Client client) {
		super();
		this.ref_cmd = ref_cmd;
		this.delai_livraison = delai_livraison;
		Address_Livraison = address_Livraison;
		Montant_cmd = montant_cmd;
		this.etat_cmd = etat_cmd;
		this.date_cmd = date_cmd;
		this.nbItems = nbItems;
		ItemProcessed = itemProcessed;
		this.client = client;
	}

	public String getEtat_cmd() {
		return etat_cmd;
	}

	public void setEtat_cmd(String etat_cmd) {
		this.etat_cmd = etat_cmd;
	}

	public Date getDate_cmd() {
		return date_cmd;
	}

	public void setDate_cmd(Date date_cmd) {
		this.date_cmd = date_cmd;
	}

	public int getNbItems() {
		return nbItems;
	}

	public void setNbItems(int nbItems) {
		this.nbItems = nbItems;
	}

	public boolean isItemProcessed() {
		return ItemProcessed;
	}

	public void setItemProcessed(boolean itemProcessed) {
		ItemProcessed = itemProcessed;
	}

	public String getRef_cmd() {
        return ref_cmd;
    }

    public void setRef_cmd(String ref_cmd) {
        this.ref_cmd = ref_cmd;
    }

    public Date getDelai_livraison() {
        return delai_livraison;
    }

    public void setDelai_livraison(Date delai_livraison) {
        this.delai_livraison = delai_livraison;
    }

    public String getAddress_Livraison() {
        return Address_Livraison;
    }

    public void setAddress_Livraison(String address_Livraison) {
        Address_Livraison = address_Livraison;
    }

    public float getMontant_cmd() {
        return Montant_cmd;
    }

    public void setMontant_cmd(float montant_cmd) {
        Montant_cmd = montant_cmd;
    }

    public Commande(){

    }
}
