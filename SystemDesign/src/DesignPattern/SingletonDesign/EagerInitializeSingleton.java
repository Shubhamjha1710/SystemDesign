package DesignPattern.SingletonDesign;

public class EagerInitializeSingleton {
    private static final EagerInitializeSingleton instance = new EagerInitializeSingleton();
    private EagerInitializeSingleton() {}
    public static EagerInitializeSingleton getInstance() { return instance; }
}
