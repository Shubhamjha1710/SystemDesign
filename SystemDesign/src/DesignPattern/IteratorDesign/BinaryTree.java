package DesignPattern.IteratorDesign;

public class BinaryTree implements Iterable<Integer>{
    public int data;
    public BinaryTree left;
    public BinaryTree right;

    BinaryTree(int val) {
        data = val;
        left = null;
        right = null;
    }

    public Iterator<Integer> createIterator() {
        return new BinaryTreeInorderIterator(this);
    }
}
