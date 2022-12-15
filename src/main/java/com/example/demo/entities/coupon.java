package com.example.demo.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
@Entity
public class coupon {

    @Id
    private String CodeCoupon;
    private int Discount;
    private double minPrice;
    private Date dateDebut;
    private Date dateExpiration;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(
            name = "clients_coupons", joinColumns = {
            @JoinColumn(name = "CodeCoupon")
    },
            inverseJoinColumns = {
                    @JoinColumn(name = "Id_client")
            }
    )
    private Collection<Client> clients;

    public String getCodeCoupon() {
        return CodeCoupon;
    }

    public void setCodeCoupon(String codeCoupon) {
        CodeCoupon = codeCoupon;
    }

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int discount) {
        Discount = discount;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Collection<Client> getClients() {
        return clients;
    }

    public void setClients(Collection<Client> clients) {
        this.clients = clients;
    }

    public coupon(String codeCoupon, int discount, double minPrice, Date dateDebut, Date dateExpiration, Collection<Client> clients) {
        CodeCoupon = codeCoupon;
        Discount = discount;
        this.minPrice = minPrice;
        this.dateDebut = dateDebut;
        this.dateExpiration = dateExpiration;
        this.clients = clients;
    }

    public coupon() {
    }
}
