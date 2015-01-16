package bookmain;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Book {
	private String bookTitle;
	private String author;
	private String ISBN;
	
	//コンストラクタ初期設定
	Book (String bookTitle, String author, String ISBN ) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.ISBN = ISBN;
		
		try (BufferedWriter writer =new BufferedWriter (new OutputStreamWriter(new FileOutputStream("output.txt"),"UTF-8"))) {
				writer.write(bookTitle);
				writer.newLine();
				writer.write(author);
				writer.newLine();
				writer.write(ISBN);
				writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
