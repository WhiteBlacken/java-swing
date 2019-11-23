package com.java1234.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java1234.model.BookType;
import com.java1234.util.StringUtil;

public class BookTypeDao {
	/**
	 * 图书类别添加
	 * @param con
	 * @param bookType
	 * @return
	 * @throws SQLException 
	 */
	public int add(Connection con,BookType bookType) throws SQLException {
		String sql="insert into t_bookType values(null,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1,bookType.getBookTypeName());
		pstmt.setString(2,bookType.getBookTypeDesc());
		return pstmt.executeUpdate();
	}
	/**
	 * 有误
	 * @param con
	 * @param bookType
	 * @return
	 * @throws Exception
	 */
	public ResultSet list(Connection con,BookType bookType) throws Exception{
		StringBuffer sb=new StringBuffer("select*from t_bookType");
		if(StringUtil.isNotEmpty(bookType.getBookTypeName())) {
			sb.append("and bookTypeName="+bookType.getBookTypeName());
		}
		PreparedStatement pstmt=con.prepareStatement(sb.toString().replaceFirst("and", "where"));
		return pstmt.executeQuery();
		
	}
	/**
	 * 删除类别
	 * @param con
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int delete(Connection con,String id)throws Exception{
		String sql="delete from t_bookType where id=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, id);
		return pstmt.executeUpdate();
	}
	/**
	 * 更新图书类别
	 * @param con
	 * @param bookType
	 * @return
	 * @throws Exception
	 */
	public int update(Connection con,BookType bookType)throws Exception{
		String sql="update t_bookType set bookTypeName=?,bookTypeDesc=?where id=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, bookType.getBookTypeName());
		pstmt.setString(2, bookType.getBookTypeDesc());
		pstmt.setInt(3, bookType.getId());
		return pstmt.executeUpdate();
		
				
	}
}
