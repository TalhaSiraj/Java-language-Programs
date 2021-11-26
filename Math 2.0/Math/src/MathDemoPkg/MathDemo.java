package MathDemoPkg;

import Geometry.Shapes.Circle;
import Geometry.Shapes.Rectangle;
import Statistics.Average;

public class MathDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println("Circle Area : "+c1.calculateArea());
        
        Rectangle r1 = new Rectangle();
        r1.setLength(20);
        r1.setWidth(40);
        System.out.println("Rectangle Area : "+r1.calculateArea());
        
        int[] arr = {2,4,6,8,10};
        Average a1 = new Average(arr);
        System.out.println("Array Mean 1 : "+a1.calculateMean());
        
        int[] newArr = {1,3,5,7,9};
        a1.setValueArray(newArr);
        System.out.println("Array Mean 2 : "+a1.calculateMean());
        
    }
    
}
