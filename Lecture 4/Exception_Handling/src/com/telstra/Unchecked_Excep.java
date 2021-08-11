package com.telstra;

public class Unchecked_Excep {
	
	public static void main(String[] args) {
		
		
		int result =0;
		
		try {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		result = n1/n2;
		} catch(ArithmeticException e1) {
			System.out.println("Denominator is zero" + e1.getMessage());
			e1.printStackTrace();
			
		}
		catch(NumberFormatException e2) {
			System.out.println("Invalid inputs" + e2.getMessage());
			e2.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e3) {
			System.out.println("Haven't given arguments" + e3.getMessage());
			e3.printStackTrace();
		}
		catch(Exception e)// any exception 
		{
			System.out.println("Exception occures"+ e.getMessage());
		}
		
		finally {
			System.out.println("In finally block");
			System.out.println("result" +result);
		}
		
		
		
		System.out.println("Byeeeeee"); //Will not be executed.
		
		
		
		
	}

}
