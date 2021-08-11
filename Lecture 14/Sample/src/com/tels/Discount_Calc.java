package com.tels;

public class Discount_Calc {
	
	private String Item_Name;
	private int quantity;
	private int price;
	private int disc_perc;
	private double discounted_price;
	
	public static void main(String[] args) {
		
		Discount_Calc d1 = new Discount_Calc("Clothes", 100, 300, 5);
		Discount_Calc d2 = new Discount_Calc("Food", 10, 100, 2);
		Discount_Calc d3 = new Discount_Calc("Shoes", 2, 30050, 10);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
	}

	public Discount_Calc(String item_Name, int quantity, int price, int disc_perc) {
		super();
		Item_Name = item_Name;
		this.quantity = quantity;
		this.price = price;
		this.disc_perc = disc_perc;
		this.discounted_price= getdiscounted_price();
	}

	@Override
	public String toString() {
		return "Discount_Calc [Item_Name=" + Item_Name + ", quantity=" + quantity + ", price per item=" + price + ", disc_perc="
				+ disc_perc + ", Total price after discount=" + discounted_price + "]";
	}
	
	public double getdiscounted_price() {
		return (1-0.01*disc_perc)*price*quantity;
	}

}
