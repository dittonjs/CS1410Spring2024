public class Main {
    public static void main(String[] args) {
        StaticStack stack = new StaticStack(5);
        stack.push(1);
        stack.push(4);
        stack.push(-23);
        stack.push(44);
        stack.push(2);


        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        // stack is empty
        stack.displayBuffer();
        stack.push(200);
        System.out.println();
        stack.displayBuffer();

        StaticQueue queue = new StaticQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        while(!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

        queue.dequeue();

    }
}
