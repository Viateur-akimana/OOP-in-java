package Interfaces.in.java;

public class TestClass implements TestInterface{
    // implementation of square abstract method
    public void square(int a)
    {
        System.out.println(a*a);
    }

    public static void main(String args[])
    {
        TestClass d = new TestClass();
        d.square(5);

        // default method executed
//        d.show();
        //static method executed
        TestInterface.show();
    }
}


