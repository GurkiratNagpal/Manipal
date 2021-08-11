package com.telstra;

public class Circle {
	private double radius;
	private String color;
	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	public Circle(String color) {
		this(3.9, color);
	}
	public Circle(double radius) {
		this(radius, "Brown");
	}
	public Circle() {
		this(3.5,"Blue");
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	}
	


