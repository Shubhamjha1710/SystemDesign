package DesignPattern.IteratorDesign;

public interface Iterable<T> {
    public Iterator<T> createIterator();
}
