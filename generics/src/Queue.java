import java.util.ArrayList;

public class Queue {
    private ArrayList<String> data = new ArrayList<>();

    public void enqueue(String value) {
        data.add(value);
    }

    public String dequeue() {
        return data.removeFirst();
    }
}
