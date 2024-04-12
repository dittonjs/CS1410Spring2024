import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(6);
        tree.insert(9);
        tree.insert(4);
        tree.insert(2);
        tree.insert(5);
        tree.insert(7);
        tree.insert(11);
        tree.insert(12);

        System.out.println("---- original tree ----");
        tree.displayTreeStructure();
        tree.displayBreadthFirst();

        BinarySearchTree copy = tree.copy();
        System.out.println("---- copy tree ----");
        copy.displayTreeStructure();
        tree.display("--- displaying in order ---");
        System.out.println("--- displaying pre-order ---");
        tree.displayPreOrder();
        System.out.println("--- displaying post-order ---");
        tree.displayPostOrder();
        // TESTING REMOVAL
//        tree.displayTreeStructure();
//
//        tree.remove(11);
//
//        System.out.println();
//        tree.displayTreeStructure();
//
//        tree.remove(4);
//
//        System.out.println();
//        tree.displayTreeStructure();
//
//        tree.remove(6);
//
//        System.out.println();
//        tree.displayTreeStructure();
//
//        tree.remove(2);
//
//        System.out.println();
//        tree.displayTreeStructure();
//
//        tree.remove(5);
//
//        System.out.println();
//        tree.displayTreeStructure();
//
//        System.out.println(tree.search(3));
//        System.out.println(tree.search(11));
    }
}
