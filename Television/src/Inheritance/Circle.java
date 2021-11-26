package Inheritance;

public class Circle extends Shape{
    private double radius;
    
    public Circle(){}
    
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    
    public Circle(String color,
            String borderColor, double radius){
        super(color,borderColor);
        this.radius = radius;
    }
    
    public Circle(String color,
            String borderColor, 
            double borderWidth,
            double radius){
        super(color,borderColor,borderWidth);
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    @Override
    public double calculateArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    
    @Override
     public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
     
    @Override
    public String toString(){
    	return "Color: "+getColor() +
                "\tBorder Color: "+getBorderColor()+
                "\tBorder Width: "+getBorderWidth()+
    	        "\tRadius: "+radius;
    }
}


















     






