package fifth_lab;
public class Circle extends Shape {
private double radius ;

Circle(){super();}

Circle(String color , double radius)
{
    super(color);
    this.radius = radius;
}
Circle(String color,String bordercolor , double radius)
{
    super(color,bordercolor);
    this.radius = radius;
}
Circle(String color,String bordercolor,double borderwidth , double radius)
{
    super(color,bordercolor,borderwidth);
    this.radius = radius;
}



public void set_Radius(double radius)
{
    this.radius = radius;
}
public double get_Radius()
{
    return radius;
}

@Override
public double CalculateArea()
{
    return Math.PI*Math.pow(radius, 2) ;
}
    
@Override
public double CalculatePerimeter()
{
    return 2*Math.PI*radius ;
}
@Override
public String toString()
{
    return super.toString()+""+radius;
}
}
