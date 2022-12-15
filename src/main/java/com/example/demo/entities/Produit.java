package com.example.demo.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class Produit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_produit;
    private String ref_Produit;
     private String designation ;
    private String description ;
   private float prix ;
   private int img_Product;
   private int qt_stocke;
  private Date DateAjout;
  private int DiscountPercent;
  private boolean discount;
  private boolean nouveaute;
  @OneToMany(mappedBy = "produit",fetch = FetchType.LAZY)
  private Collection<LigneCommande> lignesCommandes;
  
  public boolean isDiscount() {
	return discount;
}

public Produit(int id_produit, String ref_Produit, String designation, String description, float prix, int img_Product,
		int qt_stocke, Date dateAjout, int discountPercent, boolean discount, boolean nouveaute,
		Collection<LigneCommande> lignesCommandes) {
	super();
	this.id_produit = id_produit;
	this.ref_Produit = ref_Produit;
	this.designation = designation;
	this.description = description;
	this.prix = prix;
	this.img_Product = img_Product;
	this.qt_stocke = qt_stocke;
	DateAjout = dateAjout;
	DiscountPercent = discountPercent;
	this.discount = discount;
	this.nouveaute = nouveaute;
	this.lignesCommandes = lignesCommandes;
}

public Collection<LigneCommande> getLignesCommandes() {
	return lignesCommandes;
}

public void setLignesCommandes(Collection<LigneCommande> lignesCommandes) {
	this.lignesCommandes = lignesCommandes;
}

public boolean isNouveaute() {
	return nouveaute;
}

public void setDiscount(boolean discount) {
	this.discount = discount;
}

public void setNouveaute(boolean nouveaute) {
	this.nouveaute = nouveaute;
}


    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public String getRef_Produit() {
        return ref_Produit;
    }

    public void setRef_Produit(String ref_Produit) {
        this.ref_Produit = ref_Produit;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getImg_Product() {
        return img_Product;
    }

    public void setImg_Product(int img_Product) {
        this.img_Product = img_Product;
    }

    public int getQt_stocke() {
        return qt_stocke;
    }

    public void setQt_stocke(int qt_stocke) {
        this.qt_stocke = qt_stocke;
    }

    public Date getDateAjout() {
        return DateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        DateAjout = dateAjout;
    }

    public int getDiscountPercent() {
        return DiscountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        DiscountPercent = discountPercent;
    }


    public Produit(){

    }

	public Produit(int id_produit, String ref_Produit, String designation, String description, float prix,
			int img_Product, int qt_stocke, Date dateAjout, int discountPercent, boolean discount, boolean nouveaute) {
		super();
		this.id_produit = id_produit;
		this.ref_Produit = ref_Produit;
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.img_Product = img_Product;
		this.qt_stocke = qt_stocke;
		DateAjout = dateAjout;
		DiscountPercent = discountPercent;
		this.discount = discount;
		this.nouveaute = nouveaute;
	
	}

    
}
