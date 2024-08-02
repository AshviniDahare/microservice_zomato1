package com.Zomato_Consumer.ServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.Zomato_Consumer.OrderRepositary.OrderRepositary;
import com.Zomato_Consumer.ServiceI.ServiceI;
import com.Zomato_Consumer.model.Orderdetails;

@Service
public class ServiceIMPL implements ServiceI{
	@Autowired 
	OrderRepositary or;
	

	@Override
	public void saveZomato(Orderdetails od) {
		or.save(od);
			}

}
