package DesignPattern.IteratorDesign;

import java.util.*;

public class Main {
    public static BinaryTree BuildBinaryTree(ArrayList<Integer> vt) {
        BinaryTree root = null;
        Map<BinaryTree, Integer> mp = new HashMap<>();
        Queue<BinaryTree> queue = new ArrayDeque<BinaryTree>();
        for(int i = 0;i<vt.size();i++) {
            BinaryTree node = null;
            if(vt.get(i) != null) {
                node = new BinaryTree(vt.get(i));
            }

            if(i == 0) {
                root = node;
            } else {
                BinaryTree par = queue.peek();
                if (mp.get(par) == 0) {
                    par.left = node;
                    mp.put(par, 1);
                } else if (mp.get(par) == 1){
                    par.right = node;
                    queue.remove();
                }
            }

            if(node != null) {
                mp.put(node, 0);
                queue.add(node);
            }
        }
        return root;
    }

    public static void main(String []args) {
        ArrayList<Integer> vt = new ArrayList<>(
                Arrays.asList(1,2,3,4,5,null,8,null,null,6,7,9)
        );
//        ArrayList<Integer> vt = new ArrayList<>(
//                Arrays.asList(1,null,2,3)
//        );
        BinaryTree tree = BuildBinaryTree(vt);

        // Inorder traversal
        System.out.print("In-order: ");
        Iterator<Integer> inorderIterator = tree.createIterator();
        while(inorderIterator.hasNext()) {
            System.out.print(inorderIterator.getNext() + " ");
        }
        System.out.println("\n");


        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Yun Hi"));
        playlist.addSong(new Song("Tu jo hai"));
        playlist.addSong(new Song("Teri Jhuki nazar"));
        playlist.addSong(new Song("Nazaare Ho"));
        Iterator<Song> playlistIterator = playlist.createIterator();

        System.out.println("Playlist songs:");
        while (playlistIterator.hasNext()) {
            Song s =  playlistIterator.getNext();
            System.out.println(s.name);
        }



    }
}
