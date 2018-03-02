package by.htp.dao.impl;

import by.htp.bean.Book;
import by.htp.dao.BookDao;

public  class FileBookDaoImpl implements BookDao{

	@Override
	public Book[] readAll() {
		Book[] books = new Book[5];
		
		//change this code: take books from library.txt file
		books[0] = new Book();
		books[1] = new Book();
		books[2] = new Book();
		books[3] = new Book();
		books[4] = new Book();
		
		return books;
	}

	
}
