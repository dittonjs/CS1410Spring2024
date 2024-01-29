import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows and number of columns: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        double[][] myNums = generateArray(rows, columns);
        print2dArray(myNums);
    }

    public static double[][] generateArray(int rows, int columns) {
        double[][] values = new double[rows][];
        for(int row = 0; row < rows; row ++) {
            values[row] = new double[columns];
            for (int col = 0; col < columns; col ++) {
                values[row][col] = Math.random() * 1000;
            }
        }

        return values;
    }

    public static void print2dArray(double[][] values) {
        for(int row = 0; row < values.length; row ++) {
            System.out.println(values[row]);
        }
    }

//    public static void print2dArray(double[][] values) {
//        for(int row = 0; row < values.length; row ++) {
//            for(int col = 0; col < values[row].length; col++) {
//                System.out.printf("%8.2f", values[row][col]);
//            }
//            System.out.println();
//        }
//    }
}
