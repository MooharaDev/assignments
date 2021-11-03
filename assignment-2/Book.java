// mohammad alomrani 817571
public class Book {
	private String title;
	private int isbn;
	private double price;
	
	Book(String title, int isbn, double price){
		this.title = title;
		this.isbn = isbn;
		this.price = price;
	}
	
	
	String getTitle() {
		return title;
	}
	
	int getIsbn() {
		return isbn;
	}

	double getPrice() {
		return price;
	}
	
	
	static double avgPrice(Book[] arr) {
		double sum = 0;
		for(int i=0;i<arr.length;i++) {
			double price = arr[i].getPrice();
			sum += price;
		}
		return sum/arr.length;
		
	}
	
	static double highPrice(Book[] arr) {
		double max = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(arr[i].getPrice() > max) {
			max = arr[i].getPrice();
		}
	}
		
		
		return max;
	}
	
	public String toString() {
		return "";
	}
}
