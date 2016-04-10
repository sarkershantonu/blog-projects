package com.core;

import com.mysql.jdbc.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.*;

public final class MySqlConn {
	public Connection conn;
	private Statement statement; 
	public static MySqlConn db;

	private MySqlConn() {
		try{
			Class.forName(DbInfo.driver).newInstance();
			this.conn = (Connection)DriverManager.getConnection(DbInfo.URL+DbInfo.dbName,DbInfo.userName ,DbInfo.password);
			
		}catch (Exception sqlException) {
			sqlException.printStackTrace();
		}	
	}
	/**
	 * Main object creator
	 * @return
	 */
	public static synchronized MySqlConn getDbConnection(){
		if(db==null){
			db = new MySqlConn();
		}
		return db;
	}
	
	public ResultSet query(String queryString) throws SQLException{
		statement = (Statement) db.conn.createStatement();
		ResultSet results = statement.executeQuery(queryString);
		return results;		
	}
	public int insert(String insertQuerryString) throws SQLException{
		statement = (Statement) db.conn.createStatement();
		int results = statement.executeUpdate(insertQuerryString);
		return results;
	}

}
