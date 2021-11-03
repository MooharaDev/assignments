//mohammad alomrani 817571
import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Book[] arr = new Book[4];
		
		for(int i=0;i<arr.length;i++) {
		
		System.out.println("Enter the title: ");
		String title = input.next();
		System.out.println("Enter the isbn: ");
		int isbn = input.nextInt();
		System.out.println("Enter the price: ");
		double price = input.nextDouble();
		arr[i] = new Book(title, isbn, price);
		
		}
		
		
		for (Book Arr : arr) 
		{ 
		    System.out.println(Arr.toString());
		}
		
		System.out.println(Book.avgPrice(arr));
		System.out.println(Book.highPrice(arr));
	}

}
