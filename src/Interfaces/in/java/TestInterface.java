package Interfaces.in.java;

public interface TestInterface {
        // abstract method
        public void square(int a);

        // default method
//        default void show()
//        {
//            System.out.println("Default Method Executed");
//        }
    //static method
    static  void show(){
        System.out.println("Static method executed");
    }

    }
