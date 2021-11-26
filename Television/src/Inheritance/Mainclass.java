package Inheritance;

public class Mainclass {
	
	    public static void main(String[] args) {
	        /*Shape s1 = new Shape();
	        System.out.println(s1.toString());
	        Shape s2 = new Shape("Red");
	        System.out.println(s2);
	        Shape s3 = new Shape("Red","Black");
	        System.out.println(s3);
	        Shape s4 = new Shape("Red","Black",10);
	        System.out.println(s4);*/
	    	
	    	
	    	System.out.println("The Circle:\n");
	        Circle c1 = new Circle();
	        System.out.println(c1);
	        Circle c2 = new Circle("Red",5);
	        System.out.println(c2);
	        Circle c3 = new Circle("Red","Black",10);
	        System.out.println(c3);
	        Circle c4 = new Circle("Red","Black",10,15);
	        System.out.println(c4);
	        
	        System.out.println("\nThe Rectangle:\n");
	        Rectangle r1 = new Rectangle();
	        System.out.println(r1);
	        Rectangle r2 = new Rectangle("Red",5,10);
	        System.out.println(r2);
	        Rectangle r3 = new Rectangle("Red","Black",10,20);
	        System.out.println(r3);
	        Rectangle r4 = new Rectangle("Red","Black",10,15,30);
	        System.out.println(r4);
	    }
	    
	}





