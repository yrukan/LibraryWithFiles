package by.htp.bean;

import java.util.Date;

public class Catalog {
	
	private Book[] books;
	private String title;
	private Date createDate;
	
	public Catalog(){
		super();
	}

	public Catalog(Book[] books, String title, Date createDate) {
		super();
		this.books = books;
		this.title = title;
		this.createDate = createDate;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
}
