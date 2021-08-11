package com.telstra.fpack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.telstra.data.Student;

public class Read_data {

public Student[] Readere() {
	Student[] studarr = new Student[5];
	int j=0;

	try(	FileReader fr = new FileReader("C:\\Users\\d976833\\Desktop\\Bootcamp\\Lecture 5\\First_class_demo1.txt");
			BufferedReader br = new BufferedReader(fr);)
	{

		String str= "";
		while((str=br.readLine())!=null) {
			System.out.println(str);
			String[] sword = str.split(":");
			int i = Integer.parseInt(sword[0]);
			String name = sword[1];
			Student s = new Student(i, name);
			studarr[i++]=s;
			System.out.println(s);

		}
	}
	catch(IOException e1) {

	}
	return studarr;
	
}


}
