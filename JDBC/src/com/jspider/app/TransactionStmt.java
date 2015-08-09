package com.jspider.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class TransactionStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;

		ResultSet rs = null;

		try {

			Driver d = new Driver();
			DriverManager.registerDriver(d);

			String url = "jdbc:mysql://localhost:3306/j2ee?user=mysql&password=mysql";
			conn = DriverManager.getConnection(url);
			conn.setAutoCommit(false);

			String query = "insert into employee values (?,?)";
			ps = conn.prepareStatement(query);
			ps.setInt(1, 302);
			ps.setString(2, "Ashish");
			int b = ps.executeUpdate();
			System.out.println(b);

			String query1 = "insert into employee values (?,?)";
			ps1 = conn.prepareStatement(query1);
			ps1.setInt(1, 92);
			ps1.setString(2, "raghu");
			int e = ps1.executeUpdate();
			System.out.println(e);

			int m = 100 / 0;
			String query2 = "insert into employee values (?,?)";
			ps2 = conn.prepareStatement(query2);
			ps2.setInt(1, 99);
			ps2.setString(2, "Ajay");
			int f = ps2.executeUpdate();
			System.out.println(f);
			conn.commit();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

			finally {
				if (conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (ps1 != null) {
				try {
					ps1.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (ps2 != null) {
				try {
					ps2.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}
}
