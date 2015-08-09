package com.jspider.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ConnectDb {

	public static void main(String[] args) throws IOException {
		Connection conn = null;
		Statement st = null;
		try {
			Driver d = new Driver();
			DriverManager.registerDriver(d);
			String dburl = "jdbc:mysql://localhost:3306/test?user=mysql&password=mysql";
			conn = DriverManager.getConnection(dburl);
			st = conn.createStatement();
			FileReader fw = new FileReader("C:\\Users\\Ashish1992\\Desktop\\input.txt");
			BufferedReader bw = new BufferedReader(fw);
			int count = 0;
			while (true) {
				String query = bw.readLine();
				if (query == null)
					break;
				count += st.executeUpdate(query);
			}
			System.out.println("No of rows affected  :" + count);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (st != null)
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
