import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printItem("Hello, world!");
        printItem(42);
        Object scanner = new Scanner(System.in);
        doSomethingBad(scanner);
    }

    public static void doSomethingBad(Object obj) {
        Integer value = (Integer) obj;
    }

    public static <E extends Comparable<E>> void printItem(E value) {
        System.out.printf("Value: %s\n", value);
    }

    // 1. make a new node
    // 2. node.next = head;
    // 3. head = node

    /*
                  10
             4           15
         2      8     12     22
     */

    // 2 4 8 10 12 15 22 - inorder traversal
    // 10 4 2 8 15 12 22 - pre order
    // 2 8 4 12 22 15 10
    // 2 8 12 22 4 15 10

    // 23 -> 12 -> 89
    // 1. find 12 by traversing the list
    //    a. keep track of the parent
    // 2. parent.next = node.next

    /*
        public void doRecursion () {

        }

     */
    class Node {
        int value;
        Node left;
        Node right;
    }
    public void whoAmI(Node node) {
        whoAmI(node.left);
        whoAmI(node.right);
        System.out.println(node.value);
    }

    public double factorial(int i) {
        if (i == 0) return 1;
        return i * factorial(i - 1);
    }


    // push 1
    // push 2
    // pop
    // push 3
    // pop
    // pop

    // 2 3 1

}