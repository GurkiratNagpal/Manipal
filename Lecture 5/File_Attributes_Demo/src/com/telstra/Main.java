package com.telstra;

import java.io.File;
import java.io.IOException;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("C:\\Users\\d976833\\Desktop\\Bootcamp\\Lecture 5\\File_class_demo");
		// also possible: C:/Users/d976833/Desktop/Bootcamp/Lecture 5/File_class_demo
		
		
		try {
			f1.createNewFile();
			System.out.println("File created successfully);");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(f1.getAbsoluteFile()); 
		System.out.println(f1.getName());
		System.out.println(f1.getParent());
		
		
		
		File f2 = new File("C:/Users/d976833/Desktop/Bootcamp/Lecture 5", "File_class_demo1");
		try {
			f2.createNewFile();
			System.out.println("File created successfully);");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File dir = new File("C:/Users/d976833/Desktop/Bootcamp/Lecture 5");
		File[] flist = dir.listFiles();
		for(File f:flist) {
			if (f.isFile()){
				System.out.println(f.getName());
				
			}
		}
		
		
	}

}
