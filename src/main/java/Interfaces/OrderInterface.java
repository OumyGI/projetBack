package Interfaces;

import java.util.List;
import java.util.Map;

import com.example.demo.entities.Commande;

public interface OrderInterface {
	public List<Map<String, Object>>lister();
	public List<Map<String, Object>>ListerByRef(String Ref);
	public int add(Commande commande);

}
