package methodoverloading;

public class Box {
    double length;
    double height;
    double width;
    
    
    Box(){
        length=10;
        height=10;
        width=10;
    }
    
    Box(double length, double height, double width){
        this.length = length;
        this.height = height;
        this.width = width;
    }
}
