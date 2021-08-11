package com.telstra;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checked_Exception c = new Checked_Exception();
		//c.read_input1();
		try {
			System.out.println(c.read_input3());
		} catch (NumberFormatException | ArithmeticException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
