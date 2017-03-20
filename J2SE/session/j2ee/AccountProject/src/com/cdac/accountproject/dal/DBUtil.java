package com.cdac.accountproject.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static String	driver="oracle.jdbc.driver.OracleDriver";
	private static String	url="jdbc:oracle:thin:@192.168.72.3:1521:orcl";
	private static String	username="orad45";
	private static String	password="orad45";

	
	static{
		
	
		try {
			Class.forName(driver);
			System.out.println("Driver loaded......");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//static
	
	
	public static Connection getConn() throws SQLException
	{
	Connection con=null;
	con=DriverManager.getConnection(url, username, password);
	System.out.println("Connection established......");
	return con;
	}
	

	public static void closeConn(Connection con)
	{
		if(con!=null)
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	
}