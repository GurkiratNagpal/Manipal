package com.tels.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		
		
		 
		try(FileOutputStream output = new FileOutputStream("C:\\Users\\d976833\\Desktop\\Bootcamp\\Lecture 5\\Object.txt");
				ObjectOutputStream out = new ObjectOutputStream(output);
				FileInputStream input = new FileInputStream("C:\\Users\\d976833\\Desktop\\Bootcamp\\Lecture 5\\Object.txt");
				ObjectInputStream in = new ObjectInputStream(input)) {
			
			
			
			Student s1 = new Student(1000, "Gurkirat", 22);
			out.writeObject(s1);
			
			Student s2 = new Student(1000, "Abhijeet", 22);
			out.writeObject(s2);
			Student s3= new Student(1000, "Ayush", 21);
			out.writeObject(s3);
			// Deserialize the objects & read ---> No constructors
			while(input.available()>0) {
				Student s = (Student) in.readObject();
				System.out.println(s);
			}
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				

		
	}

}
