public class SortedLinkedList<T extends Comparable<T>> {
    private Node head = new Node();
    private class Node {
        T data;
        Node next;
    }

    public void insert(T data) {
        Node newNode = new Node();
        newNode.data = data;

        Node parent = head;
        Node node = head.next;
        while(node != null) {
            if (data.compareTo(node.data) <= 0) {
                parent.next= newNode;
                newNode.next = node;
                return;
            }
            parent = node;
            node = node.next;
        }
        parent.next = newNode;
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
            if (node.data.compareTo(data) == 0) {
                parent.next = node.next;
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
