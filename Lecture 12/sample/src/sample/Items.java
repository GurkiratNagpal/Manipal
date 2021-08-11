package sample;

import java.util.ArrayList;

public class Items{
	private String Item_Name;
	private float Item_Price;
	private int Item_Quantity;
	public Items(String n, float p, int q){
		this.Item_Name = n;
		this.Item_Price = p;
		this.Item_Quantity= q;
	}
	public String getItem_Name(){
		return this.Item_Name;
	}
	@Override
	public String toString() {
		return "Items [Item_Name=" + Item_Name + ", Item_Price=" + Item_Price + ", Item_Quantity=" + Item_Quantity
				+ "]";
	}
	public float getItem_Price(){
		return this.Item_Price;
	}
	public int getItem_Quantity(){
		return this.Item_Quantity;
	}
	
	public static void main(){
	Items i1 = new Items("Pencil", 12, 50);
	Items i2 = new Items("Paper", 2, 50);
	Items i3 = new Items("Pen", 22, 50);
	ArrayList<Items> item_list = new ArrayList<Items>();
	item_list.add(i1);
	item_list.add(i2);
	item_list.add(i3);
	item_list.forEach(System.out::println);
	}
}