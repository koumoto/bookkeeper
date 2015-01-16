/**
 * BookKeeperのメインクラス
 * 
 * @author Junichi Koumoto
 */

package bookmain;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	int correctInt = 1;
	String bookName;
	String author;
	String ISBN;
	
	//タイトル入力
	do {
		System.out.println("本のタイトルを記入してください。");
		Scanner scan1 = new Scanner(System.in);
		bookName = scan1.next();
		
		System.out.println(bookName + "でよろしいでしょうか。");
		System.out.println("1:正しい2:訂正する。");
		
		Scanner scan2 = new Scanner(System.in);
		correctInt = scan2.nextInt();
	}while (correctInt == 2);
	
	//作者名入力
	do {
		System.out.println("本の作者を記入してください。");
		Scanner scan3 = new Scanner(System.in);
		author = scan3.next();
		
		System.out.println(author + "でよろしいでしょうか。");
		System.out.println("1:正しい2:訂正する。");
		
		Scanner scan4 = new Scanner(System.in);
		correctInt = scan4.nextInt();
	}while (correctInt ==2);
	
	//ISBN入力
	boolean check = true;
	do {
		System.out.println("ISBNを記入してください。");
		Scanner scan5 = new Scanner(System.in);
		ISBN =scan5.next();
		
		check = CheckISBN.checkISBN(ISBN);
	} while (correctInt ==2 || check);
	
	//Bookクラスの使用
	Book b1 = new Book(bookName, author,ISBN);
	
	}

}
