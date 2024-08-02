package com.Zomato_Cunsumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Zomato_Consumer.ServiceI.ServiceI;
import com.Zomato_Consumer.model.Menu;
import com.Zomato_Consumer.model.Orderdetails;

@RestController
public class HomeController {
	@Autowired
	ServiceI si;
	
	@Autowired
	RestTemplate rs;

	@PostMapping("/saveproduce")
	public String saveMenu(@RequestBody Menu m) {
		String url = "http://localhost:8080/saveMenu";
		rs.postForObject(url, url, String.class);
		return "success";

	}

	@GetMapping("/getAllProduce")
	public List<Menu> getAllproduce() {
		String url = "http://localhost:8080/getAllMenu";
		List<Menu> list = rs.getForObject(url, List.class);
		return list;

	}

	@GetMapping("/getSingleMenuProduce/{menuId}")
	public String GetSingleMenu(@PathVariable("menuId") int menuId) {
		String url = "http://localhost:8080/getById";
		String menu = rs.getForObject(url, String.class);
		return menu;

	}

	@GetMapping("/ZomtogetAllorder")
	public List<Orderdetails> getAllOrders() {
		String url = "http://localhost:8080/gelAllOrders";
		List<Orderdetails> list = rs.getForObject(url, List.class);
		return list;

	}

	@PostMapping("/zomatosaveOrder/{menuId}")
	public String oredrSave(@PathVariable("menuId") int menuId, @RequestBody Orderdetails od) {
		String url = "http://localhost:8080/saveOrder";
		si.saveZomato(od);
		rs.postForObject(url, url, String.class);
		return "Zomato data successfully save";

	}
}
