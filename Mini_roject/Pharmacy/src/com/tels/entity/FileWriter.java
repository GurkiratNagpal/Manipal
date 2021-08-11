package com.tels.entity;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class FileWriter {
	public static String writeToFilePharma() {

		try (FileOutputStream output = new FileOutputStream("C:\\Users\\d976833\\Documents"+ "\\pharma"+".dat", true);
				ObjectOutputStream out = new ObjectOutputStream(output);

		) {

			// Writing the serilized object into the file

			for (Pharm_drugs pd : pdlist) {
				out.writeObject(pd);
				out.flush();

			}

			System.out.println("Records written");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Pharma Written Successfully";

	}

}
