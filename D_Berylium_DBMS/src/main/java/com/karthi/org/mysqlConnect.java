package com.karthi.org;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;

public class mysqlConnect {

	public static void main(String[] args) {



		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "D@ngereag1e";

		String Query = "select * from karthik";
		Connection con = null;
		Statement st = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			st = con.createStatement();
			ResultSet rs = st.executeQuery(Query);
			while (rs.next()) {
				System.out.println(rs.getInt("id") + "--" + rs.getString("name") + "--" + rs.getInt("age"));

			}
		} catch (Exception e) {

		}

	}

}
