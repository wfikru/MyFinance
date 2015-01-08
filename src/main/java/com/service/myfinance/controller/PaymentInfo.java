package com.service.myfinance.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Entity
public class PaymentInfo {

	@javax.persistence.Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int Id;
	private String creditCardNumber;
	private String address;
	private double profit;
	private double total;
	private double profiToMycompany;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getProfit() {
		return profit;
	}
	public void setProfit(double profit) {
		this.profit = profit;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getProfiToMycompany() {
		return profiToMycompany;
	}
	public void setProfiToMycompany(double profiToMycompany) {
		this.profiToMycompany = profiToMycompany;
	}
	
	
	
}
