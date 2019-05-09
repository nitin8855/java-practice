package com.nit.lamdaExpression.with_stream;

public class Product {
	private String id;
	private String name;
	private long price;
	private int quantity;
	private String manufacture;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(String id, String name, long price, int quantity, String manufacture) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.manufacture = manufacture;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", manufacture="
				+ manufacture + "]";
	}
	
	

}
