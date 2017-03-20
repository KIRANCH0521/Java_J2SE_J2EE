package jdbc;
import java.sql.*;
import oracle.jdbc.OracleDriver;



public class TestOracleConn {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Connection cn=null;
		try {
			//load JDBC driver
			Class.forName("oracle.jdbc.OracleDriver");
			//get fixed cn from underlying driver 
			String dbURL="jdbc:oracle:thin:@192.168.72.3:1521:orcl";
			cn=DriverManager.getConnection(dbURL, "", "");
			System.out.println("cn established....");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (cn != null)
				cn.close();
		}

	}

}
