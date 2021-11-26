package Inheritance;

public class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle(){}
    
    public Rectangle(String color, 
            double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }
    
    public Rectangle(String color,
            String borderColor,
            double length, double width){
        super(color,borderColor);
        this.length = length;
        this.width = width;
    }
    
    public Rectangle(String color,
            String borderColor, 
            double borderWidth,
            double length, double width){
        super(color,borderColor,borderWidth);
        this.length = length;
        this.width = width;
    }
    
    public double getLength(){
        return length;
    }
    
    public void setLength(double length){
        this.length = length;
    } 
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return length*width;
    }
    
    @Override
    public double calculatePerimeter(){
        return (2*length)+(2*width);
    }
        
    @Override
    public String toString(){
		return "Color: "+getColor()+
                "\tBorder Color: "+getBorderColor()+
                "\tBorder Width: "+getBorderWidth()+
                "\tLength: "+length+
                "\tWidth: "+width;
    }
}
















