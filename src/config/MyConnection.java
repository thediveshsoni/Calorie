package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	static Connection con;
	static
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/worldfoodhackathon","root","divesh");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public static Connection getConnection(){
		return con;
	}
}
