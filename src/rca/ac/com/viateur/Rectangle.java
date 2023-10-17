package rca.ac.com.viateur;

public class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle(String color,double width, double length){
        super(color);
        this.length = length;
        this.color = color;
        this.width = width;
    };

    double area = length * width;

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }

}
