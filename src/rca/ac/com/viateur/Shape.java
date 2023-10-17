package rca.ac.com.viateur;

public  abstract class  Shape {
    protected String color;
    public Shape(String color){
        this.color = color;
    }
    public abstract double area();
    public abstract String toString();
    public void print(){
        System.out.println("SOme thing from shape");
    }

}
