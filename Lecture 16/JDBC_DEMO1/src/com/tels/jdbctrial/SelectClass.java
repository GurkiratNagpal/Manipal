package com.tels.jdbctrial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SelectClass {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "gurkirat";
		String pass = "gurkirat";
		String cmd = "SELECT * from emp";
		int i=0;
		Connection cn =null;
		Statement st = null;
		ResultSet rs = null;
		try {
			cn = DriverManager.getConnection(url, user, pass);
			st = cn.createStatement();
			rs =  st.executeQuery(cmd);
			while(rs.next()) {
				int id = rs.getInt("id");
				String type = rs.getString("type");
				System.out.println(id + "     " + type);
				
			}

			
			System.out.println(i);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}