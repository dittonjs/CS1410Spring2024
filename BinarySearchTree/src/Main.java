public class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(6);
        tree.insert(4);
        tree.insert(9);
        tree.insert(2);
        tree.insert(5);
        tree.insert(7);
        tree.insert(11);

        tree.display();

        System.out.println(tree.find(3));
        System.out.println(tree.find(11));
    }
}
