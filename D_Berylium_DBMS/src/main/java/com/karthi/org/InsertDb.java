package com.karthi.org;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

public class InsertDb {

	public static void main(String[] args) {
	
		String url= "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password ="D@ngereag1e";
		Connection con = null;
		PreparedStatement ps =null;
		String query="insert into karthik values(?,?,?)";
				
		try {
			System.out.println("A");
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, username, password);
			ps= con.prepareStatement(query);
			System.out.println("B");
			ps.setInt(1, 3);
			ps.setString(2, "naga");
			ps.setInt(3, 22);
			
			System.out.println("hii");
			
			
			int result = ps.executeUpdate();
			
			System.out.println(result);
			
			
			
			
		}
		catch(Exception e) {
			
		}
		
		

	}

}
