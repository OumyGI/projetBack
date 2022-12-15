package com.example.demo.DAO;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.*;

import Interfaces.OrderInterface;

@Repository
public class OrderDAO implements OrderInterface{
	@Autowired
	JdbcTemplate template;
	
	
	@Override
	public List<Map<String, Object>> lister() {
		List<Map<String, Object>> list = template.queryForList("select * from commande");
		return list;
	}
	@Override
	public List<Map<String, Object>> ListerByRef(String Ref) {
		String sql="select * from commande where ref_cmd=";	
		
		return null;
	}
	@Override
	public int add(Commande commande) {
		// TODO Auto-generated method stub
		return 0;
	}

}
