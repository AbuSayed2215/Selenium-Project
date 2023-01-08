package com.smarttechqa.dbutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MSSQL {

	static String username = "smarttechqa_SQLLogin_1";
	static String password = "9ryk2qzaeu";
	static String connection = "jdbc:sqlserver://techshop.mssql.somee.com:1433;DatabaseName=techshop";
	
	
	public static void getDataTable () throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection connect = DriverManager.getConnection(connection,username, password );
		Statement statement = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet result = statement.executeQuery("select * from products");
		while (result.next()) {
		//result.getString(2);
		System.out.println(result.getString(2));
		}
	}
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	MSSQL.getDataTable();
}
}
