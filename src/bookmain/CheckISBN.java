package bookmain;

public class CheckISBN {

	public static boolean checkISBN(String ISBN) {
		
		Integer odd = 0;
		Integer even = 0;
		
		odd = odd + Integer.valueOf(ISBN.substring(0,1));
		odd = odd + Integer.valueOf(ISBN.substring(2,3));
		odd = odd + Integer.valueOf(ISBN.substring(4,5));
		odd = odd + Integer.valueOf(ISBN.substring(6,7));
		odd = odd + Integer.valueOf(ISBN.substring(8,9));
		odd = odd + Integer.valueOf(ISBN.substring(10,11));
		
		even = even +Integer.valueOf(ISBN.substring(1,2));
		even = even +Integer.valueOf(ISBN.substring(3,4));
		even = even +Integer.valueOf(ISBN.substring(5,6));
		even = even +Integer.valueOf(ISBN.substring(7,8));
		even = even +Integer.valueOf(ISBN.substring(9,10));
		even = even +Integer.valueOf(ISBN.substring(11,12));
		
		int sum = odd + even * 3;
		
		int digit = 10 - (sum % 10);
		
		
		if (digit == 10) {
			digit = 0;
		}
		
		if (Integer.valueOf(ISBN.substring(12,13)) == digit) {
			return false;
		} else {
			return true;
		}
	}
}
