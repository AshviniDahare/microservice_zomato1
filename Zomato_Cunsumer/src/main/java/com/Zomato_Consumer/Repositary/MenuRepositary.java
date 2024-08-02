package com.Zomato_Consumer.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Zomato_Consumer.model.Menu;



@Repository
public interface MenuRepositary extends JpaRepository<Menu, Integer>{

}
