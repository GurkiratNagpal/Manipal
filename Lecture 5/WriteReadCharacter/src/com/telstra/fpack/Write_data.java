package com.telstra.fpack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.telstra.data.Student;

public class Write_data {
	private String createRec(Student s) {
		return (s.getStudID() + ":" + s.getSname());

	}
	public void writeRec(int id, String name) {
		Student s = new Student(id, name);
		String str = createRec(s);


		try(FileWriter out = new FileWriter("C:\\Users\\d976833\\Desktop\\Bootcamp\\Lecture 5\\First_class_demo1.txt", true);
				BufferedWriter br = new BufferedWriter(out);) {
			br.write(str);
			br.newLine();
			System.out.println("rECORDED");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}








	}
}
