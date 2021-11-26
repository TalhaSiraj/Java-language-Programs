package equation;
import java.lang.Math;
import java.util.Scanner;
public class eq {

public static void main(String[] args) {
			        
Scanner input = new Scanner(System.in);
int x;		        
System.out.println("Enter the value of X :");
x = input.nextInt();
		        
double ans = 3*(x^4)*Math.sin(180*x) + 4*(x^3)*Math.cos(90*x) + (x*2)*Math.sin(Math.tan(45)) + 7*x + 9*Math.cos(90*x^2);
System.out.println("3x4sin(180x) + 4x3cos(90x) + x2sin(tan(45)) + 7x + 9cos(90x2 ) Answer Is :"+ans);
}
}


