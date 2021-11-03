// mohammad alomrani 817571
import java.util.*;
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Person[] arr = new Person[5];
		
		for(int i=0;i<arr.length;i++) {
		
		System.out.println("Enter the name: ");
		String name = input.next();
		System.out.println("Enter the age: ");
		int age = input.nextInt();
		arr[i] = new Person(name, age);
		
		}
		
		
		for (Person Arr : arr) 
		{ 
		    System.out.println(Arr.toString());
		}
		
		System.out.println(Person.averageAge(arr));
		
	}

}
