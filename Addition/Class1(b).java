
package main;

public class Main {
    public static void main(String[] args) {
    int a=5,b=2,c;
    
    c=add(a,b);
    
    System.out.println(""+c);
    
    //*OR
    //System.out.println(""+add(a,b));
    System.out.println(""+sub(a,b));
    System.out.println(""+multiply(a,b));
    System.out.println("\n"+division(a,b=0));
    
    System.out.println("After double conversion"+division_V(a,b));
    System.out.println("After double conversion_V1"+division_V(a,b));
    
    int il=5;
    //Implicit Casting
    long ll=il;
    double lol=ll;
    //Explicit Casting
    int lol2=(int) lol;//First convert double into integer this happen explicitly
    
    
       //It will convert into 1 if 2.2 then 2;
    System.out.println("Floor 1.4 = "+Math.floor(1.4));
       //It will convert into +1 if 1.2 then 2;
    System.out.println("Floor 1.4 = "+Math.ceil(1.4));
    
    
    }
    static int add(int a,int b)
    {int num1=a,num2=b,total=0;
    
    total = num1+num2;
        return total;
    }
    static int sub(int a,int b)
    {int num1=a,num2=b,total=0;
    
    total = num1-num2;
        return total;
    }
    static int multiply(int a,int b)
    {
    int num1=a,num2=b,total=0;
    
    total = num1*num2;
        return total;
    }
    static int division(int a,int b)
    {
        if(b != 0)
        {
        return a/b;
        }
        
        else
        {
            System.out.println("B can not be 0");
            return -1;
        }
    
}
    static double division_V(int a,int b)
    {
        if(b != 0)
        {
        return ((double)a)/((double)b);//Here int a convert first same for b and then divide .
        }
        
        else
        {
            System.out.println("B can not be 0");
            return -1;
        }
    
}
    static double division_V1(int a,int b)
    {
        if(b != 0)
        {
        return (double)a/b;//After a/b we have 2.5 right after we convert into double without data loss .
        }
        
        else
        {
            System.out.println("B can not be 0");
            return -1;
        }
    
}
}