public class StaticQueue {
    private int[] data;
    private int start = 0;
    private int end = 0;

    private boolean isFull = false;

    public StaticQueue(int size) {
        data = new int[size];
    }

    public void enqueue(int value) {
        if (isFull) {
            throw new RuntimeException("Queue is full");
        }
        data[end] = value;
        end ++;
        if (end == data.length) {
            end = 0;
        }
        if (end == start) {
            isFull = true;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        isFull = false;
        int value = data[start];
        start ++;
        if (start == data.length) {
            start = 0;
        }
        return value;
    }

    public boolean isEmpty() {
        return !isFull &&  start == end;
    }
}
