package DesignPattern.SingletonDesign;

public class Main {
    public static void main(String []args) {
        LazyInitializeSingleton a = LazyInitializeSingleton.getInstance();
        LazyInitializeSingleton b = LazyInitializeSingleton.getInstance();



        if(a == b) {
            System.out.println("Both instance are same");
        }
    }
}
