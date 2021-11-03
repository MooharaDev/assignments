// mohammad alomrani 817571
public class Person {
	private String name;
	private int age;
	
	static int totalAge;
	
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
//		age += totalAge;
	}
	
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	
	static int averageAge(Person[] arr) {
//		return totalAge;
		for(int i=0;i<arr.length;i++) {
			int age = arr[i].getAge();
			totalAge += age;
		}
		return totalAge/arr.length;
	}
	
	public String toString() {
		return "the name " + name + " the age " + age;
	}
	

}
