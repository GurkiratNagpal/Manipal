package com.telstra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		// intput can be File class ref or it can be absolute path of a file 
		try (FileReader fr = new FileReader("C:\\Users\\Admin\\Desktop\\telstrafile1.txt");
			BufferedReader br = new BufferedReader(fr);){
			
			
			    String str;
			
				//str = br.readLine();
				
				//while(!(str.equalsIgnoreCase("END")))
				while ((str=br.readLine())!=null)  // checking EOF condition 
				{
					System.out.println(str);
					//str = br.readLine();
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




}
