package Assignment_1;

public class execution {

   public static void main(String[] args) {
	 method_overloading M1= new method_overloading();
	 System.out.println("Your Addition Of Int Numbers Is = "+M1.add(4,2));
	 System.out.println("Your Addition Of Double Numbers Is = "+M1.add(4.5,2.3));
	 System.out.println("Your Addition Of long Numbers Is = "+M1.add(2147483700L,2147483670L));
	 System.out.println("Your Subtraction Of Int Numbers Is = "+M1.sub(4,2));
	 System.out.println("Your Subtraction Of Double Numbers Is = "+M1.sub(4.5,2.3));
	 System.out.println("Your Subtraction Of Long Numbers Is = "+M1.sub(2147483700L,2147483670L));
	 System.out.println("Your Multiplication Of Int Numbers Is = "+M1.mun(4,2));
	 System.out.println("Your Multiplication Of Double Numbers Is = "+M1.mun(4.5,2.3));
	 System.out.println("Your Multiplication Of Long Numbers Is = "+M1.mun(2147483700L,2147483670L));
	 System.out.println("Your Division Of Int Numbers Is = "+M1.div(4,2));
	 System.out.println("Your Division Of Double Numbers Is = "+M1.div(4.5,2.3));
	 System.out.println("Your Division Of Long Numbers Is = "+M1.div(2147483700L,2147483670L));        
   }
}

