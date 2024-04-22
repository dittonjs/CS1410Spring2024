public class StaticStack {
    private int[] data;
    private int stackPointer = -1;

    public StaticStack(int size) {
        data = new int[size];
    }

    public boolean isEmpty() {
        return stackPointer == -1;
    }

    public int pop() {
        int value = data[stackPointer];
        stackPointer --;
        return value;
    }

    public void push(int value) {
        if (stackPointer == data.length -1) {
            throw new StackOverflowError("Stack is full!!");
        }
        stackPointer ++;
        data[stackPointer] = value;
    }

    public void displayBuffer() {
        for (int value : data) {
            System.out.println(value);
        }
    }
}
