package encapsulationlecture;

public class MainClass {

    public static void main(String[] args) {
        Car c1 = new Car("2018","Toyota","Blue");
        System.out.println("Model : "+c1.getModel());
        System.out.println("Brand : "+c1.getBrand());
        System.out.println("Color : "+c1.getColor());
        
        c1.setColor("Red");
        System.out.println("Model : "+c1.getModel());
        System.out.println("Brand : "+c1.getBrand());
        System.out.println("Color : "+c1.getColor());
        
    }
    
}
