import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> data = new ArrayList<>();

    public void push(T value) {
        data.addFirst(value);
    }

    public T pop() {
        return data.removeFirst();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
