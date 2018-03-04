package by.htp.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import by.htp.bean.Book;
import by.htp.dao.BookDao;

public class FileBookDaoImpl implements BookDao {

	private static final String FILE_PATH = "resources/Library.txt";
	private int booksCounter = 0;
	private Book[] books;

	public void addBook(Book book) {
		if (this.books != null) {
			if (booksCounter < this.books.length) {
				this.books[booksCounter] = book;
				booksCounter++;
			} else {
				Book[] newcatalog = new Book[this.books.length + 1];
				for (int i = 0; i < this.books.length; i++) {
					newcatalog[i] = this.books[i];
				}
				this.books = newcatalog;
				this.books[booksCounter] = book;
				booksCounter++;
			}
		} else {
			this.books = new Book[5];
			this.books[0] = book;
			booksCounter++;
		}
	}
	
	public Book createBook(int id, String title, int date){
		Book book = new Book();
		book.setId(id);
		book.setTitle(title);
		book.setYear(date);
		return book;
	}

	@Override
	public Book[] readAll() {

		try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
			String str = null;
			int i = 0; // books counter
			String[] words;
			int j = 0; // words counter

			while ((str = br.readLine()) != null) {
				words = str.split(" ");
				Book book = createBook(i+1, words[0], Integer.parseInt(words[1]));				
				book.setAuthor(1, words[2], words[3]);					
				addBook(book);
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return books;
	}

}
