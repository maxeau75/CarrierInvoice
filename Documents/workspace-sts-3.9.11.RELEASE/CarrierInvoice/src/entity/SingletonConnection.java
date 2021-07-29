package entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class SingletonConnection {
	

	private static Connection connection;
	
		
	static{
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection= DriverManager.getConnection("jdbc:sqlserver://74.208.85.68;" + "databaseName=CarrierGistics;user=max1;password=Fleet2020!");
			System.out.println("Connection created");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection()
	{
		return connection;
	}

}
