package com.Zomato_Cunsumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Zomato_Consumer.model.Menu;

@RestController
public class HomeController {

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
public String GetSingleMenu(@PathVariable ("menuId")int menuId) {
	String url="http://localhost:8080/getById";
	String	menu=	rs.getForObject(url, String.class);
	
	return menu;
	
}
}
