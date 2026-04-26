package tester;
import java.util.Scanner;
import com.app.geometry.*;
public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the co-ordinates of the 1 point:");
		Point2D p1 = new Point2D(sc.nextDouble(),sc.nextDouble());
		
		System.out.println("Enter the co-ordinates of the 2 point:");
		Point2D p2 = new Point2D(sc.nextDouble(),sc.nextDouble());
		
		
		System.out.println("P1 Details :"+p1.getDetails());
		System.out.println("P2 Details :"+p2.getDetails());
		
		if (p1.isEqual(p2)) {
            System.out.println("p1 & p2 are located at the same position.");
        } else {
            System.out.println("p1 & p2 are located at different positions.");
            double distance = p1.calculateDistance(p2);
            System.out.printf("Distance between p1 and p2: %.2f\n", distance);
        }

		
		

	}

}
