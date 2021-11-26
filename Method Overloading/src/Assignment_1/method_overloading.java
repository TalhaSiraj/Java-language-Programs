package Assignment_1;

public class method_overloading {
	
	    public int add(int num1, int num2)
	    {
	        return num1+num2;
	    }
	    public double add(double num1, double num2)
	    {
	        return num1+num2;
	    }
	    public long add(long num1, long num2)
	    {
	        return num1+num2;
	    }
	    public int sub(int num1,int num2)
	    {
	        return num1 -num2;
	    }
	    public double sub(double num1, double num2)
	    {
	        return num1-num2;
	    }
	    public long sub(long num1, long num2)
	    {
	        return num1-num2;
	    }
	    public int mun(int num1,int num2)
	    {
	        return num1*num2;
	    }
	    public double mun(double num1,double num2)
	    {
	        return num1*num2;
	    }
	    public long mun(long num1,long num2)
	    {
	        return num1*num2;
	    }
	    public int div(int num1,int num2){
	      if(num2!=0){
		     return num1/num2;  
		  }
		  else{
		     System.out.println("Second Argument Can Not Be Zero");
		  }
		      return -1;
		}  
	    public double div(double num1,double num2){
	      if(num2!=0){
			  return num1/num2;  
		  }
		  else{
		      System.out.println("Second Argument Can Not Be Zero");
		  }
			  return -1;
	    } 
	    public long div(long num1,long num2){
	      if(num2!=0){
	          return num1/num2;  
	      }
	      else{
	          System.out.println("Second Argument Can Not Be Zero");
	      }
	          return -1;
	    }

}	    
	    
