package com.app.jd1;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.mysql.jdbc.Driver;;

public class Normal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		ResultSet res=null;
		Statement st=null;
		

		Driver d = new Driver();
		DriverManager.registerDriver(d); 
		String url = "jdbc:mysql://localhost:3306/j2ee?user=mysql&password=mysql";
		conn = DriverManager.getConnection(url);
		String query = "select * from employee where eid = 1";
		String query1 = "insert into employee values (34,"ram")";
		
		st = conn.createStatement();

		
		 
		
		 boolean b1 = st.execute(query);
		 if(b1 == true )
		 {
		 res = st.getResultSet();
		 while (res.next()) 
		 {
		 int eid = res.getInt("eid");
		 String ename = res.getString("ename");
		 System.out.println(eid + "\t" + ename);
		}
		
		 }
		 else
		 {
		 int x= st.getUpdateCount();
		 System.out.println(x);
		 }
		 
		 
		  catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		 
		 finally {
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
	
	


