package methodoverloading;

public class MethodOverloading {

    public static void main(String[] args) {
        // TODO code application logic here
        //Math.add(2,3);
        Box b1 = new Box();
        b1.length = 10;
        b1.height=15;
        b1.width=20;
        
        Box b2 = new Box(10,15,20);
  
    }
    
}
