// Quadratic Calculator. NaN will be be produced if equation involves imaginary number (i)
import java.util.*;

public class Exercise8 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("I can solve your quadratic equation, give me a,b,and c");
		System.out.print("a?");
		double a = console.nextDouble();
		System.out.print("b?");
		double b = console.nextDouble();
		System.out.print("c?");
		double c = console.nextDouble();
		console.close();
		
		printQuadratic(a,b,c);
	

	}
	public static void printQuadratic(double a, double b, double c)  {
		if(a<=0||b<=0||c<=0) {
			throw new IllegalArgumentException("Number must be greater than 0");
		}
		double x = ( -1*b + Math.sqrt(Math.pow(b, 2)-(4*a*c)) )/2*a;
		double x1= (((-1*b))- (Math.sqrt((Math.pow(b, 2)-(4*a*c)))))/2*a;
		System.out.println("x = "+x+", x = "+x1);
	}
}
