package DesignPattern.SingletonDesign;

public class LazyInitializeSingleton {
    private static LazyInitializeSingleton instance;
    private LazyInitializeSingleton() {}
    public static LazyInitializeSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializeSingleton();
        }
        return instance;
    }
}
