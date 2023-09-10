package com.login.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil 
{
	private static Connection connection=null;
	
	public static Connection getConnection() throws SQLException {
		if(connection!=null)
		{
			return connection;
		}
		else
		{
			String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url="jdbc:sqlserver://localhost;databaseName=book;encrypt=false";
			String user="sa";
			String password="himansu@123";
			
			
			try {
				Class.forName(driver);
				connection=DriverManager.getConnection(url,user,password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
	

}
