package Inheritance;

	abstract public class Shape {
	    private String color;
	    private String borderColor;
	    private double borderWidth;
	    
	    public Shape(){}
	    
	    public Shape(String color){
	        this.color = color;
	    }
	    
	    public Shape(String color, 
	            String borderColor){
	        this(color);
	        this.borderColor = borderColor;
	    }
	    
	    public Shape(String color, 
	            String borderColor, 
	            double borderWidth){
	        this(color,borderColor);
	        this.borderWidth = borderWidth;
	    }
	    
	    void draw(){
	        System.out.println("Shape is Drawing");
	    }
	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public String getBorderColor() {
	        return borderColor;
	    }

	    public void setBorderColor(String borderColor) {
	        this.borderColor = borderColor;
	    }

	    public double getBorderWidth() {
	        return borderWidth;
	    }

	    public void setBorderWidth(double borderWidth) {
	        this.borderWidth = borderWidth;
	    }
	    
	    abstract public double calculateArea();
	    
	    abstract public double calculatePerimeter();
	    
	    @Override
	    abstract public String toString();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


