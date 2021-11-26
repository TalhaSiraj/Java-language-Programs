package Geometry.Shapes;

public class Circle {
    private double radius;
    
    public double calculateArea(){
        return Math.pow(getRadius(), 2)* Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
}
