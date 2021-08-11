package com.telstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//READING INPUT
//DATA FROM CONSOLE USING DATA STREAMS 
public class Checked_Exception {
	public void read_input1() {
		int result = 0;

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String str1, str2;
		try {
			System.out.println("1st:");
			str1 = br.readLine();
			System.out.println("2nd:");
			str2 = br.readLine();

			result = Integer.parseInt(str1)/Integer.parseInt(str2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		finally {
			try {
				ir.close();
				br.close();
				System.out.println("Result:" +result);
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
		}
	}
	
	
	
	
	public void read_input() {
		try(InputStreamReader ir = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(ir);){
			String str1, str2;
			int result = 0;
			System.out.println("1st:");
			str1 = br.readLine();
			System.out.println("2nd:");
			str2 = br.readLine();
			System.out.println(Integer.parseInt(str1)/Integer.parseInt(str2));
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
	}
	
	
	public int read_input3() throws IOException, NumberFormatException, ArithmeticException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String str1, str2;
		int result = 0;
		System.out.println("1st:");
		str1 = br.readLine();
		System.out.println("2nd:");
		str2 = br.readLine();

		return result;
		
	}
	}


