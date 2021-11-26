
package main;

public class Main {
    public static void main(String[] args) {
    double x=2,result=0;
    //3x4sin(180x)
   double p1= 3*Math.pow(x, 4)*Math.sin((180*x));
    //4x3cos(90x)
   double p2= 4*Math.pow(x,3)*Math.cos((90*x));
   //x2sin(tan(45))
   double p3=Math.pow(x,2)*Math.sin(Math.tan(45));
   //7x
   double p4=7*x;
    //9cos(90x2)
   double p5=9*Math.cos((90*Math.pow(x, 2)));
    
    result = p1+p2+p3+p4+p5;
    
    System.out.println("Result is "+result);
    
    
    
    }
    
}