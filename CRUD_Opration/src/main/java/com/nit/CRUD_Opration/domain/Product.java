package com.nit.CRUD_Opration.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "P_ID", updatable = false, nullable = false)
	private int id;
	@Column(name = "P_NAME")
	private String name;
	@Column(name = "P_PRICE")
	private double price;
	@Column(name = "P_QUAN")
	private int quantity;
	@Column(name = "P_DESC")
	private String description;
	@Column(name = "P_PHOTO")
	private String photo;
	@Column(name = "P_AVAILABLE")
	private boolean isAvailable;

	public Product(int id, String name, double price, int quantity, String description, String photo,
			boolean isAvailable) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
		this.photo = photo;
		this.isAvailable = isAvailable;
	}

	public Product() {
		
	}

	// setter and getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	// toString method
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", description="
				+ description + ", photo=" + photo + ", isAvailable=" + isAvailable + "]";
	}
}
