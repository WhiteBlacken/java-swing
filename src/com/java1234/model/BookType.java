package com.java1234.model;
/**
 * 图书类别实体
 * @author QW
 *
 */
public class BookType {
	private int id;
	private String bookTypeName;
	private String bookTypeDesc;
	public int getId() {
		return id;
	}
	
	public BookType() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public BookType(String bookClass, String bookClassDesc) {
		// TODO Auto-generated constructor stub
		super();
		this.bookTypeName = bookClass;
		this.bookTypeDesc = bookClassDesc;
	}

	public BookType(int id, String bookTypeName, String bookTypeDesc) {
		super();
		this.id = id;
		this.bookTypeName = bookTypeName;
		this.bookTypeDesc = bookTypeDesc;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getBookTypeName() {
		return bookTypeName;
	}
	public void setBookTypeName(String bookTypeName) {
		this.bookTypeName = bookTypeName;
	}
	public String getBookTypeDesc() {
		return bookTypeDesc;
	}
	public void setBookTypeDesc(String bookTypeDesc) {
		this.bookTypeDesc = bookTypeDesc;
	}
	public String toString() {
		return bookTypeName;
	}
}
