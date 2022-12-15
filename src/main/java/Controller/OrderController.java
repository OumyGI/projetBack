package Controller;

import java.util.List;
import org.springframework.ui.Model;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.DAO.*;
@RestController
@RequestMapping("/commandes")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@GetMapping("/liste")
	public List<Map<String, Object>> getAllOrders(Model model){
	     return this.service.lister();
	}
	@GetMapping("/{id}")
	public List<Map<String, Object>> findById(String Ref) throws Exception {
		List<Map<String, Object>> list=null;
		try {
			list=this.service.ListerByRef(Ref);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return list ;
	}
	

}
