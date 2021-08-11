package com.tels;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadObj() {
	try(FileInputStream input = new FileInputStream("C:\\Users\\d976833\\Desktop\\Bootcamp\\Lecture 5\\std.dat");
			ObjectInputStream in = new ObjectInputStream(input)) {
		
		while(input.available()>0) {
			Student s = (Student) in.readObject();
			s.setTotal();
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

