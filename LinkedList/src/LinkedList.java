public class LinkedList<T> {
    private Node head = new Node();
    private class Node {
        T data;
        Node next;
    }

    public void insert(T data) {
        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        last.next = new Node();
        last.next.data = data;
    }

    public boolean find(T data) {
        Node node = head;
        while(node != null) {
            if (node.data == data) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public void remove(T data) {
        Node parent = head;
        Node node = parent.next;
        while(node != null) {
            if (node.data == data) {

            }
        }
    }

}
