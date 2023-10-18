package org.onlineshoppingportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
	
	@Id
	@Column(name = "Code", length = 20, nullable = false)
	private String code;

	@Column(name = "Name", length = 255, nullable = false)
	private String name;

	@Column(name = "Price", length = 20, nullable = false)
	private double price;

	@Column(name = "Quantity", length = 20, nullable = false)
	private int quantity;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
