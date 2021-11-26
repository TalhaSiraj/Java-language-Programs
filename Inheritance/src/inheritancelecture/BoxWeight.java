package inheritancelecture;

public class BoxWeight extends Box{
    double weight;
    
    BoxWeight(double length, double width, double height, double weight){
        super(length,width,height);
        this.weight = weight;
    }
    
    
}
