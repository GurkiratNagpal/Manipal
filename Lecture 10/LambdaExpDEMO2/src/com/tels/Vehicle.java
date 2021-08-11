package com.tels;

public interface Vehicle {
	default void print() {
		System.out.println("Vehicle yay!");
	}
	default void say() {
		System.out.println("poopoo!");
	}
}
