package com.tels;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Writeobj (){
	try(FileOutputStream output = new FileOutputStream("C:\\Users\\d976833\\Desktop\\Bootcamp\\Lecture 5\\std.dat");
			ObjectOutputStream out = new ObjectOutputStream(output)){
		
		
		
		Student s1 = new Student(1000, 50, 22);
		out.writeObject(s1);
		
		Student s2 = new Student(1000, 20, 22);
		out.writeObject(s2);
		Student s3= new Student(1000, 30, 21);
		out.writeObject(s3);
		// Deserialize the objects & read ---> No constructors
		
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			

	
}

