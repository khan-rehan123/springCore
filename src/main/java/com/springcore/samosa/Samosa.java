package com.springcore.samosa;

public class Samosa {
	private double price;


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("set samosa price");
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	public void init() {
		System.out.println("init method eneble ");
	}
	public void destroy() {
		System.out.println("destroy method enable :");
	}

}
