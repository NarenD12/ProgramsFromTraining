package com.infinite.pojo;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "Product")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Product {

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ProductId")
	private int pid;
	@Column(name = "ProductName")
	private String pname;
	@Column(name = "Price")
	private int price;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
