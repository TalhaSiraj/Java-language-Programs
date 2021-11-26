package encapsulationlecture;

public class Car {
    private String model;
    private String brand;
    private String color;
    
    public Car(){
     
    }
    
    public Car(String model,String brand,String color){
        this.model = model;
        this.brand = brand;
        this.color = color;       
    }
    
    public String getModel(){
        return model;
    }
    
    public String getBrand(){
        return brand;
    }
     
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color; 
    }
}