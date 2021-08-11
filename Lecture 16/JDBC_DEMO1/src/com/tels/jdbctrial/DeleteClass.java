package com.tels.jdbctrial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteClass {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "gurkirat";
		String pass = "gurkirat";
		String insCom = "Delete from emp where type ='Manager'";
		int i=0;
		Connection cn =null;
		Statement st = null;
		try {
			cn = DriverManager.getConnection(url, user, pass);
			st = cn.createStatement();
			i=st.executeUpdate(insCom);

			System.out.println(i);


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
