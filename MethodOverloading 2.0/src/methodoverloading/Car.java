package methodoverloading;

public class Car {
    String model;
    String brand;
    String color;
    String regNo;
    
    Car(){
        this("2016","Toyota","Red","AAA-100");
    }
    
    Car(String model){
        this.model = model;
    }
    
    Car(String model, String brand){
        this(model);
        this.brand = brand;
    }
    
    Car(String model, String brand, String color){
        this(model,brand);
        this.color = color;
    }
    
    Car(String model, String brand, String color, String regNo){
        this(model,brand,color);
        this.regNo = regNo;
    }
}