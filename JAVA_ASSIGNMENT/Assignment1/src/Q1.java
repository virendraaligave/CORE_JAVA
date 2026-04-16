import java.util.Scanner;
public class Q1 {
       
	public static void main(String[] args) {
		int number;
		String octal,hexa,binary;
		Scanner sc= new Scanner(System.in);
		
	   System.out.println("Enter the Number: ");
	   number=sc.nextInt();
	   
	   octal= Integer.toOctalString(number);
	   binary = Integer.toBinaryString(number);
	   hexa = Integer.toHexString(number);
	   
	   System.out.println("Given Number:"+octal);
	   System.out.println("Octal equivalen:"+octal);
	   System.out.println("Hexa equivalen:"+hexa);
	   System.out.println("Binary equivalen:"+binary);
		

	}

}
