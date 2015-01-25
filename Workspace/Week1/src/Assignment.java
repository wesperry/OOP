import java.util.*;
import java.text.DecimalFormat;
public class Assignment {
	
	public static void main(String[] args) {
		int rad;
		double area, diam;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the circle.");
		
		rad = scan.nextInt();
		scan.close();
		
		area = circArea(rad);
		diam = circDiam(rad);
		
		System.out.println("The circle's radius is " + rad + ", the area is " + area);
		System.out.println("The diameter is "+ diam +".");

		return;
		
	}
	
	static double circArea(int rad){
		
		return rad * rad * Math.PI;
	}
	
	static double circDiam(int rad){
		
		return 2 * rad;
	}
}