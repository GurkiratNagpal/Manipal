package com.telstra.mainpack;

import java.io.FileWriter;
import java.util.Scanner;

import com.telstra.data.Student;
import com.telstra.fpack.Read_data;
import com.telstra.fpack.Write_data;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID? ");
		int id = sc.nextInt();
		System.out.println("Name? ");
		String name = sc.next();
		sc.close();
		Write_data wd = new Write_data();
		wd.writeRec(id, name);
		Read_data r = new Read_data();
		Student[] studarr = r.Readere();
		System.out.println("Student deets: ");
		for(Student s:studarr) {
			if(s!=null) {
				System.out.println(s);
			}
		}
		
		
		
		
		
		
	}
}
