package by.htp.runner;

import by.htp.bean.Book;
import by.htp.bean.Catalog;
import by.htp.logic.LibraryService;
import by.htp.logic.impl.CityLibraryServiceImpl;

public class LibrarianMain {

	public static void main(String[] args) {
		
		LibraryService service = new CityLibraryServiceImpl();
		Catalog booksCatalog = service.getMainCatalog();
		viewCatalogInfo(booksCatalog);

	}
	
	private static void viewCatalogInfo(Catalog catalog){
		for(Book book : catalog.getBooks()){
			System.out.println(book);
		}
	}

}
