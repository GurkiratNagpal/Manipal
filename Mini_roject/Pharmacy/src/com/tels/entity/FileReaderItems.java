package com.tels.entity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class FileReaderItems {
	
	
	@SuppressWarnings("finally")
	public static ArrayList<Item> ReadItems(String prod_type){
	ArrayList<Item> prod_array = new ArrayList<Item>();
	String File_name = "C:\\Users\\d976833\\Documents"+ "\\pharma"+".dat";
	try(FileInputStream input = new FileInputStream(File_name);
			ObjectInputStream in = new ObjectInputStream(input)) 
	{
		// Deserialize the objects & read 
		while(input.available()>0) {
			Item s = (Item) in.readObject();
			prod_array.add(s);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		return prod_array;
	}
		
	}
	
}

