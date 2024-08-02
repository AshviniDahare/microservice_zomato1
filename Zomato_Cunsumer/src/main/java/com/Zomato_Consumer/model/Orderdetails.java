package com.Zomato_Consumer.model;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name="OrderDetails_Zomato")
public class Orderdetails {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int orderId;
private String customerName;
private String paymentmode;
private String customerAddress;
private String shiftFrom;
@ManyToOne
private Menu orderMenu;
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getPaymentmode() {
	return paymentmode;
}
public void setPaymentmode(String paymentmode) {
	this.paymentmode = paymentmode;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
public String getShiftFrom() {
	return shiftFrom;
}
public void setShiftFrom(String shiftFrom) {
	this.shiftFrom = shiftFrom;
}
public Menu getOrderMenu() {
	return orderMenu;
}
public void setOrderMenu(Menu orderMenu) {
	this.orderMenu = orderMenu;
}
}
