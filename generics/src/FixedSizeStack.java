import java.util.EmptyStackException;

public class FixedSizeStack {
    int[] values;
    int stackPointer = -1;

    public FixedSizeStack(int size) {
        values = new int[size];
    }

    public void push(int value) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        stackPointer ++;
        values[stackPointer] = value;
    }


    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = values[stackPointer];
        stackPointer--;
        return value;
    }

    public boolean isEmpty() {
        return stackPointer == -1;
    }

    public boolean isFull() {
        return stackPointer == values.length - 1;
    }
}
