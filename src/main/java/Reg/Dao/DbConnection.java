package Reg.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	
	public static Connection getconnection()
	{
		 String str="oracle.jdbc.OracleDriver";
		 String Url="jdbc:oracle:thin:@localhost:1521:XE";
		 String usern="system";
		 String pass="123456789";
		 Connection con=null;
		 
		 try {
			Class.forName(str);
			 con=DriverManager.getConnection(Url, usern, pass);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return con;
		
	}
}
