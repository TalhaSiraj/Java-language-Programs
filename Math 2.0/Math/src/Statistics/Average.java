package Statistics;

public class Average {
    private int[] valueArray;
    
    public Average(int[] valueArray){
        this.valueArray = valueArray;
    }
    
    public double calculateMean(){
        int sum = 0;
        for(int i=0;i<getValueArray().length;i++){
            sum+=getValueArray()[i];
        }
        
        return (double) sum/getValueArray().length;
    }
    
    public void calculateMode(){
        System.out.println("Mode Calculation");
    }
    
    
    public void calculateMedian(){
        System.out.println("Mode Calculation");
    }

    public int[] getValueArray() {
        return valueArray;
    }

    public void setValueArray(int[] valueArray) {
        this.valueArray = valueArray;
    }
   
}
