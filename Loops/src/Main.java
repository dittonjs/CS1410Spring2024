import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("(%d,%d)\n", i, j);
            }
        }

//        String name = "Joseph";
//        while(!name.equals("Jo")) {
//            name = name.substring(0, name.length() - 1);
//            System.out.println(name);
//        }

        Scanner scanner = new Scanner(System.in);
        String input = "";
//        while(true) {
//            System.out.println();
//            System.out.println("Enter a command (up, left, right, down, exit): ");
//            input = scanner.next();
//            System.out.printf("Your command was %s\n", input);
//            if (input.equals("exit")) {
//                break;
//            }
//            if () {
//
//            }
//        }

        int[] nums = {123,432,5435,1231,432423};
        System.out.println();

        for(int value: nums) {
            System.out.printf("My num is %d\n", value);
        }



        System.out.println("Goodbye!");
    }
}
