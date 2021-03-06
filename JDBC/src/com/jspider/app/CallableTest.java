package com.jspider.app;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class CallableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		CallableStatement cs = null;
		ResultSet rs = null;

		try {
			Driver d = new Driver();
			DriverManager.registerDriver(d);
			String dburl = "jdbc:mysql://localhost:3306/j2ee?user=mysql&password=mysql";
			conn = DriverManager.getConnection(dburl);
			String query = "call UPSERT(?,?,?)";

			cs = conn.prepareCall(query);
            cs.setInt(1, 2);
            cs.setString(2, "Priyanka");
			cs.setLong(3, 962034130);

			boolean b = cs.execute();
			if (b) {
				System.out.println("db result");
				rs = cs.getResultSet();
				while (rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					Long phone = rs.getLong(3);
					System.out.println(id + "\t" + name+"\t" + phone );
				}
			} else {

				int a = cs.getUpdateCount();
				System.out.println("Rows are affected " + a);
			}

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
			if (cs != null)
				try {
					cs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}

	}

}
