package by.htp.runner;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.Reader;

public class MainApp3 {

//	Reader reader = new FileReader(FILE_PATH);
//	BufferedReader br = new BufferedReader(reader);
	
	private static final String FILE_PATH = "resources/sample.txt";

	public static void main(String[] args) {
		
		OutputStream os;
		
		try(BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))){
			//String str = br.readLine();
			String str = null;
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
//        try(Reader reader = new FileReader(FILE_PATH)){
//  	
//        	int count;
//        	char[] chars = new char[1024];
//        	do{
//        	//count = reader.read();
//        	//System.out.print((char)count);
//        		count = reader.read(chars);
//        	}while(count > 0);
//        	System.out.println(new String(chars));
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
  		
	}
}
