package core_java;

public class Assignment_1 {

	public static void main(String[] args) {
		checkage();
		// TODO Auto-generated method stub
		
	}
	public static void checkage() {
		int age = 59;
		if (age> 59 && age<=100) {
			System.out.println("senior citizen");
			
		}
		if (age > 0 && age<=2) {
			System.out.println("infant");
			
		}
		if (age >2 && age <=12) {
			System.out.println("child");
		}
		if (age >12 && age <=25) {
			System.out.println("youth");
		}
		if (age >25 && age <=59) {
			System.out.println("adult");
		}
	}
	


}
