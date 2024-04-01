import java.util.ArrayList;



public class Queue<T>{
    private ArrayList<T> data = new ArrayList<>();

    public void enqueue(T value) {
        data.add(value);
    }

    public T dequeue() {
        return data.removeFirst();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
