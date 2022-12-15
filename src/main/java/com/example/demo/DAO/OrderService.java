package com.example.demo.DAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Commande;

import Interfaces.OrderInterface;

import com.example.demo.DAO.*;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements OrderInterface{
	

	@Autowired
	OrderDAO dao;
	

	public int add(	Commande commande) {		
		return dao.add(commande);
	}

	@Override
	public List<Map<String, Object>> lister() {
		return dao.lister();
	}

	@Override
	public List<Map<String, Object>> ListerByRef(String Ref) {
		return dao.ListerByRef(Ref);
		
	}
}
