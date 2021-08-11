package com.telst;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
public static void main(String[] args) {
		
		
		try(InputStream input = new FileInputStream("C:\\Users\\d976833\\Desktop\\Bootcamp\\Lecture 5\\File_class_demo");
				InputStream bis = new BufferedInputStream(input)){
			
			byte[] buffer = new byte[bis.available()];
					
					bis.read(buffer);
			
			for(byte b:buffer) {
				System.out.print((char)b);
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
