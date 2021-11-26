package fifth_lab;

public class Fifth_lab {
    public static void main(String[] args) {
        String color= "Red";
        String border_color= "Black";
        double border_width = 10;
        
        //FOR SHAPE CLASS
        
    Shape S_Cl_OB = new Shape();
    Shape S_Cl_OB1 = new Shape(color);
    Shape S_Cl_OB2 = new Shape(color,border_color);
    Shape S_Cl_OB3 = new Shape(color,border_color,border_width);
        
    
    System.out.println("\n"+S_Cl_OB.toString()+"\n"+S_Cl_OB1+"\n"+S_Cl_OB2+"\n"+S_Cl_OB3);
    
    System.out.println("Default Constructor : ");
        S_Cl_OB.draw();
    System.out.println("Parameterize Constructor 1: ");
        S_Cl_OB1.draw();
    System.out.println("Parameterize Constructor 2: ");
        S_Cl_OB2.draw();
    System.out.println("Parameterize Constructor 3: ");    
        S_Cl_OB3.draw();
    
        //FOR CIRCLE CLASS
    Circle C_Cl_OB = new Circle();
    Circle C_Cl_OB1 = new Circle(color,5);
    Circle C_Cl_OB2 = new Circle(color,border_color,border_width);
    Circle C_Cl_OB3 = new Circle(color,border_color,border_width,15);
    
    System.out.println("\n"+C_Cl_OB.toString()+"\n"+C_Cl_OB1+"\n"+C_Cl_OB2+"\n"+C_Cl_OB3);
        
        
        //FOR RECTANGLE CLASS
    Rectangle R_Cl_OB = new Rectangle();
    Rectangle R_Cl_OB1 = new Rectangle(color,10,border_width);
    Rectangle R_Cl_OB2 = new Rectangle(color,border_color,10,border_width);
    
    System.out.println("\n"+R_Cl_OB.toString()+"\n"+R_Cl_OB1+"\n"+R_Cl_OB2);
            }
    
}
