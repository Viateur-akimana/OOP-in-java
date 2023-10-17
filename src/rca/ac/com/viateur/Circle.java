package rca.ac.com.viateur;

public class Circle extends Shape{
    private double radius ;
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
