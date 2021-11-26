package fifth_lab;
public class Rectangle extends Shape{
    private double lenght;
    private double Width;
    
    Rectangle(){}
    Rectangle(String color,double lenght , double Width)
    {
        super(color);
        this.lenght = lenght;
        this.Width = Width;
    }
    Rectangle(String color,String bordercolor,double lenght , double Width)
    {
        super(color,bordercolor);
        this.lenght = lenght;
        this.Width = Width;
    }
    
    
public void set_lenght(double lenght)
{
    this.lenght = lenght;
}
public double get_lenght()
{
    return lenght;
}
public void set_Width(double Width)
{
    this.Width = Width;
}
public double get_Width()
{
    return Width;
}
    

    @Override
    public double CalculateArea()
{
    return lenght*Width ;
}
    @Override
    public double CalculatePerimeter()
{
    return 2*lenght*2*Width ;
}
    public String toString()
{
    return super.toString()+"Lenght is "+lenght+"\tWidth is "+Width;
}
}
