package DesignPattern.IteratorDesign;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderIterator implements Iterator<Integer>{
    List<BinaryTree> aux = new ArrayList<BinaryTree>();
    BinaryTreeInorderIterator(BinaryTree root) {
        aux.add(root);
    }

    public boolean hasNext() {
        if(aux.isEmpty()) {
            return false;
        } else {
            if ((aux.size() == 1) && (aux.getFirst() == null)) {
                return false;
            } else {
                return true;
            }
        }
    }

    public Integer getNext() {
        Integer nextVal = -1;
        BinaryTree curr = aux.removeLast();
        while(curr != null) {
            aux.add(curr);
            curr = curr.left;
        }

        if(!aux.isEmpty()) {
            curr = aux.removeLast();
            nextVal = curr.data;
            aux.add(curr.right);
        }
        return nextVal;
    }
}
