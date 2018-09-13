package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbcConnection {
	
public static void main(String args[]) {
	String connectionUrl = "jdbc:sqlserver://localhost;instanceName=SQLEXPRESS14;"+  
			  "databaseName=sonar_db;user=sonar_user;password=sonar";  
			try {
				Connection con = DriverManager.getConnection(connectionUrl);
				System.out.println(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
}
}
