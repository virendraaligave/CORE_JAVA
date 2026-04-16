import java.util.Scanner;
public class Q3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int choice = 0;
		int total=0;

		do {
			int quantity=0;
		    System.out.println("Enter you food item choice");
			System.out.println("1.Dosa :   50");
			System.out.println("2.Idli :   30");
			System.out.println("3.Samosa : 20");
			System.out.println("4.Poha :   25");
			System.out.println("5.Upma :   15");
			System.out.println("6.Generate Bill ");
			choice =sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the quantity:");
				quantity=sc.nextInt();
				total+=quantity*50;	
				break;
				
			case 2:
				System.out.println("Enter the quantity:");
				quantity=sc.nextInt();
				total+=quantity*30;	
				break;
			
			case 3:
				System.out.println("Enter the quantity:");
				quantity=sc.nextInt();
				total+=quantity*20;	
				break;
			
			case 4:
				System.out.println("Enter the quantity:");
				quantity=sc.nextInt();
				total+=quantity*25;	
				break;
				
			case 5:
				System.out.println("Enter the quantity:");
				quantity=sc.nextInt();
				total+=quantity*15;	
				break;
				
			case 6:
				System.out.println(total);
				break;
				
			default :
				 System.out.println("Please enter the valid option: ");
									
			}
			
		}while(choice!=0);

	}

}
