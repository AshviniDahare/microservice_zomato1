package com.Zomato_Consumer.OrderRepositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Zomato_Consumer.model.Orderdetails;
@Repository
public interface OrderRepositary<Order_Zomato_> extends JpaRepository<Orderdetails, Integer>{

}
