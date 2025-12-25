package com.example;
import java.sql.*;
/**
 * 
 */

/**
 * 
 */
public class DBUtil {

	/**
	 * @param args
	 */
	public static Connection getConnection() throws Exception{
		String url = "jdbc:mysql://localhost:3306/authdb";
		String userName = "root";
		String passWord = "2002";
		return DriverManager.getConnection(url, userName, passWord);
	}

}
