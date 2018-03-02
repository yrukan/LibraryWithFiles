package by.htp.logic.impl;

import by.htp.logic.LibraryService;
import by.htp.bean.Book;
import by.htp.bean.Catalog;
import by.htp.dao.BookDao;
import by.htp.dao.impl.FileBookDaoImpl;

public class CityLibraryServiceImpl implements LibraryService {

	private BookDao dao = new FileBookDaoImpl();
	
	@Override
	public Catalog getMainCatalog() {
		
		Catalog catalog = new Catalog();
		
		Book[] books = dao.readAll();
		catalog.setBooks(books);
		catalog.setTitle("HTP_TAT_7_BOOK_CATALOG");
		
		return catalog;
	}

}
