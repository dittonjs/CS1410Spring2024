public class LinkedList<T> {
    private Node head = new Node();
    private Node tail = head;
    private class Node {
        T data;
        Node next;
    }

    public void insert(T data) {
        Node node = new Node();
        node.data = data;
        tail.next = node;
        tail = tail.next;
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

    public boolean remove(T data) {
        Node parent = head;
        Node node = parent.next;
        while(node != null) {
            if (node.data == data) {
                parent.next = node.next;
                if (node == tail) {
                    tail = parent;
                }
                return true;
            }
            parent = node;
            node = node.next;
        }
        return false;
    }

    public void display() {
        display(head.next);
    }

    private void display(Node node) {
        if (node == null) return;
        System.out.println(node.data);
        display(node.next);
    }
}
