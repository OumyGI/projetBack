package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.DAO.OrderDAO;
import com.example.demo.entities.Client;
import com.example.demo.entities.Commande;

@SpringBootTest
class ProjetdevMobileApplicationTests {
    /*@Autowired 
    private OrderDAO orderDao;
	
	@Test
	void addOrderTest() {
		//client
		Client client=new Client();
		client.setNom("oumaima");
		//Date
		Date date = null;
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    String date1 = "22/12/2022";
	    try {
			date = simpleDateFormat.parse(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Commande commande= new Commande();
		commande.setAddress_Livraison("12,Rue Tachafine ,sale");
		commande.setDate_cmd(new Date());
		commande.setDelai_livraison(date);
		commande.setItemProcessed(false);
		commande.setNbItems(2);
		commande.setRef_cmd("GH4516419");
		commande.setMontant_cmd((float) 1500.20);
		commande.setEtat_cmd("S");
		commande.setClient(client);
		orderDao.add(commande);
	}*/
	

}
