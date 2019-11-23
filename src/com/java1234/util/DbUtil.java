package com.java1234.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

/**
 * 数据库工具类
 * @author QW
 *
 */
public class DbUtil {
	private String dbUrl="jdbc:mysql://localhost:3306/db_book?useUnicode=true&characterEncoding=UTF-8";
	private String dbUserName="root";
	private String dbPassword="qw123456";
	private String jdbcName="com.mysql.jdbc.Driver";
	/**
	 * 获取数据库连接
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public Connection getCon() throws SQLException, ClassNotFoundException {
		Class.forName(jdbcName);
		Connection conn=(Connection) DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
		
		return conn;
		
	}
	/**
	 * 关闭数据库
	 * @param conn
	 * @throws Exception
	 */
	public void closeCon(Connection conn)throws Exception{
		if(conn!=null) {
			conn.close();
		}
	}
	public static void main(String[] args) {
		DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.print("数据库连接成功");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print("数据库连接失败");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.print("数据库连接失败");
			e.printStackTrace();
		}
	}
}
