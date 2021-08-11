package com.tels;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
	public static void main(String[] args) {
		
		
		try(FileInputStream input = new FileInputStream("C:\\Users\\d976833\\Desktop\\Bootcamp\\Lecture 5\\File_class_demo");
				BufferedInputStream bis = new BufferedInputStream(input);
				FileOutputStream output = new FileOutputStream("C:\\Users\\d976833\\Desktop\\Bootcamp\\Lecture 5\\First_class_demo_copy");
				BufferedOutputStream bos = new BufferedOutputStream(output)){
			
			int c;
			while((c=bis.read())!=-1) {
				
				bos.write(c);
				System.out.println((char)c);
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
	}
}
