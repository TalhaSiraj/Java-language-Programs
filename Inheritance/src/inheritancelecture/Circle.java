package inheritancelecture;

public class Circle extends Shape{
    double radius;
    //String color;
    
    void printState(){
        //System.out.println("Color = "+super.color);
        System.out.println("Color = "+color);
        System.out.println("Border = "+getBorder());
        System.out.println("Radius = "+radius);
    }
}
