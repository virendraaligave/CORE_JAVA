import java.util.Scanner;
public class Q2 {
	
	public static void main(String[] args) {
		double average;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Double value:");
		
		if(!sc.hasNextDouble()) {
			System.out.println("Please Enter valid Double value:");
			return;
		}
		double num1 = sc.nextDouble();	
		
		System.out.println("Enter 2 Double value");		
		if(!sc.hasNextDouble()) {
			System.out.println("Please Enter valid Double value:");
			return;
		}
		
		double num2 = sc.nextDouble();
		average = (num1 + num2)/2;
		
		System.out.println("Average of numbers is:"+average);
;
	}

}
