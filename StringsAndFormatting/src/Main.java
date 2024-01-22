import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char myChar = 'a';
        int myInt = myChar;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your command (up, down, left, right): ");
        String command = scanner.next().toLowerCase();
        System.out.println(command.charAt(2));
//        System.out.println("Welcome, " + name + "!");

//        if (name == "Joseph") {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }

        if (
                command.equals("up") ||
                command.equals("down") ||
                command.equals("left") ||
                command.equals("right")
        ) {

        }
        final String up = "up";
        switch (command) {
            case up:
            case "down":
            case "left":
            case "right":
                System.out.println("You entered a valid command!");
                // handle the command here
                break;
            default:
                System.out.println("Not a valid command");
        }
    }
}