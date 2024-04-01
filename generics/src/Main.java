public class Main {
    public static void main(String[] args) {
        Queue<String> dmvLine = new Queue<>();
        dmvLine.enqueue("Joseph");
        dmvLine.enqueue("Catelyn");
        dmvLine.enqueue("Sophie");
        dmvLine.enqueue("Daniel");
        dmvLine.enqueue("Happy");

        printQueue(dmvLine);


        Stack<String> exams = new Stack<>();
        exams.push("Joseph");
        exams.push("Catelyn");
        exams.push("Sophie");
        exams.push("Daniel");
        exams.push("Happy");

        while(!exams.isEmpty()) {
            String exam = exams.pop();
            System.out.printf("Grading exam for %s\n", exam);
        }

        FixedSizeStack fixedSizeStack = new FixedSizeStack(3);
        fixedSizeStack.push(3);
        fixedSizeStack.push(5);
        fixedSizeStack.push(2);
        System.out.println("Popped: " + fixedSizeStack.pop());
        fixedSizeStack.push(3);
    }

    public static <T> void printQueue(Queue<T> queue) {
        while(!queue.isEmpty()) {
            T value = queue.dequeue();
            System.out.println(value);
        }
    }
}
