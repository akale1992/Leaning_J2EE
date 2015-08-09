package com.jspider.app;

import java.io.FileInputStream;
import java.sql.*;
import java.sql.Connection;
import com.mysql.jdbc.Driver;

public class Test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement st = null;
		ResultSet res = null;

		String url = "jdbc:mysql://localhost:3306/j2ee?user=mysql&password=mysql";
		String driver = "com.mysql.jdbc.Driver";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url);
			st = conn.createStatement();

//			 res = st.executeQuery("SELECT * FROM employee  ");
//			 while (res.next()) {
//			 int eid = res.getInt("eid");
//			 String ename = res.getString("ename");
//			 System.out.println(eid + "\t" + ename);
//			 }
			int b = st.executeUpdate("Delete From  employee where eid = 11");
			System.out.println("Rows are affected  " + b);
			//
			// String sql = "SELECT * FROM employee";

			// boolean b1 = st.execute( sql);
			// if(b1 == true ){
			// res = st.getResultSet();
			// while (res.next()) {
			// int eid = res.getInt("eid");
			// String ename = res.getString("ename");
			// System.out.println(eid + "\t" + ename);
			// }
			// }
			// else{
			// int x= st.getUpdateCount();
			// System.out.println(x);
			// }
			//

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.close();
			}
			if (st != null) {
				st.close();
			}
			if (res != null) {
				res.close();
			}
		}

	}

}
