package org.model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.Statement;

public class DAOHelloWorld {

	private static DAOHelloWorld INSTANCE;
	private static String URL = "jdbc:mysql://localhost/wsexia?autoReconnect=true&useSSL=false";
	private static String LOGIN = "root";
	private static String PASSWORD = "";
	private Connection connection;
	private Statement statement;
	
	public DAOHelloWorld()
	{
		this.connection = null;
		this.statement = null;
	}
	
	public static DAOHelloWorld getInstance()
	{
		if(DAOHelloWorld.INSTANCE == null)
		{
			DAOHelloWorld.INSTANCE = new DAOHelloWorld();
		}
		
		return DAOHelloWorld.INSTANCE;

	}
	
	public static String getQuerySelectFirstHelloWorld()
	{
		return "SELECT * FROM helloworld";		
	}
	
	protected ResultSet executeQuery(String query)
	{
		return null;		
	}
	
	 public Boolean open() {
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			 this.connection = DriverManager.getConnection(DAOHelloWorld.URL,
			 DAOHelloWorld.LOGIN, DAOHelloWorld.PASSWORD);
			 this.statement = this.connection.createStatement();
		 } 
		 
		 catch (final ClassNotFoundException e) {
			 e.printStackTrace();
			 return false;
		 }
		 
		 catch (final SQLException e) {
			 e.printStackTrace();
			 return false;
		 }
		 
		 System.out.println("Connexion");
		 return true;
	} 

	
	public void close()
	{
		try {
			this.connection.close();
			this.statement.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		System.out.print("Fin de la connexion");
	}
	
}
