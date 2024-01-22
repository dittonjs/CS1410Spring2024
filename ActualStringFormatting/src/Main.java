import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in 3 numbers: ");
        double amount1 = scanner.nextDouble();
        double amount2 = scanner.nextDouble();
        double amount3 = scanner.nextDouble();

        double mean = (amount1 + amount2 + amount3) / 3;

        System.out.println(
                "The mean of " + amount1 + ", " + amount2 + ", and " + amount3 + " is " + mean
        );

        System.out.printf(
                "The mean of %-10.2f, %-10.2f, and %-10.2f is %-10.2f. Nice job %10s\n",
                amount1,
                amount2,
                amount3,
                mean,
                "Joseph"
        );

    }
}
