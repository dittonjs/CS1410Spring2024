import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Circle circle = new Circle(10);
            circle.setRadius(10);
        } catch (RadiusOutOfBoundsException e) {

        } finally {
            System.out.println("I am in main");
        }

//        while(true) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Input 2 integers: ");
//
//            try {
//                int value1 = scanner.nextInt();
//                int value2 = scanner.nextInt();
//                int result = divide(value1, value2);
//                System.out.printf("The result is: %d\n", result);
//            } catch (InputMismatchException e) {
//                System.out.println("You must input a number!");
//            } catch (ArithmeticException e) {
//                System.out.println("Can't divide by 0, moron!");
//            }
//
//            System.out.print("Continue? (y/n):");
//            String selection = scanner.next();
//            if (selection.equals("n")) {
//                break;
//            }
//        }
    }

    public static int divide(int value1, int value2) {
        return value1 / value2;
    }
}

class RadiusOutOfBoundsException extends Exception {
    public RadiusOutOfBoundsException() {
        super("Circle radius must be greater than 0");
    }
}
class Circle {
    private double radius;
    public Circle(double radius) throws RadiusOutOfBoundsException {
        try {
            setRadius(radius);
        } finally {
            System.out.println("I am in Circle");
        }
    }

    /**
     * Sets the radius if the radius is greater than 0
     * @param radius
     */
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }
}
