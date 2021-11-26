package fifth_lab;
public class Shape {
private String color ;
private String borderColor ;
private double borderWidth;

Shape(){}
Shape(String color)
{
    this.color = color;
}
Shape(String color,String borderColor)
{
    this(color);
    
    this.borderColor = borderColor;
}
Shape(String color,String borderColor,double borderWidth)
{
    this(color,borderColor);
    
    this.borderWidth = borderWidth;
}


public void set_col(String color)
{
    this.color = color;
}
public void set_Border_col(String borderColor)
{
    this.borderColor = borderColor;
}
public void set_Border_Width(double borderWidth)
{
    this.borderWidth = borderWidth;
}


public String get_col(String color)
{
    return this.color = color;
}
public String get_Border_col(String borderColor)
{
   return this.borderColor = borderColor;
}
public double get_Border_Width(double borderWidth)
{
    return this.borderWidth = borderWidth;
    
}



public void draw()
{
    System.out.println("Color is : "+color+".\tBorder color is  : "+borderColor+".\tBorder width is : "+borderWidth+".");
}
public double CalculateArea()
{
    return 0 ;
}
public double CalculatePerimeter()
{
    return 0 ;
}

@Override
public String toString()
{
    return "Color is : "+color+".Border color is  : "+borderColor+".Border width is : "+borderWidth+".";
}


}
