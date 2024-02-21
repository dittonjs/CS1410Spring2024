import java.util.Scanner;

public class Main {

    public static final double GRAVITY = 9.8;

    public static void main(String[] args) {
        GRAVITY = 3.4;
        int age = 1;
        int someNum = age;

        System.out.println("asdfasdf");

        int[] values = {1, 3, 4, 6};
        int[] moreValues = new int[4];
        double mass = 2.3;
        double asdf = GRAVITY * mass;

        System.out.println(values[2]);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Put a double: ");
        double myDouble = scanner.nextDouble();
        float myFloat = (float)myDouble;
        System.out.println(myDouble);
        System.out.println(myFloat);
        int num = 22;
        System.out.println("\"Hello\nworld!\"");

        if (!(true || !(true && false))) {

        }

        int qwer = (int)(Math.random() * 10 + 1);

        switch (num) {
            case 10:
                System.out.println("I am ten");
                break;
            case 22:
                System.out.println("I am 22");
            default:
                System.out.println("I am the default");
        }


        int myNum = 10;
        doubleMyNum(myNum);
        System.out.println(myNum);
    }


    public static void doubleMyNum(int a) {
        a *= 2;
    }
}
