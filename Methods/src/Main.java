import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("input 2 integers: ");
//        int val1 = scanner.nextInt();
//        int val2 = scanner.nextInt();
//
//        System.out.printf("The bigger number is: %d \n", max(val1, val2));
//
//        System.out.print("input 2 numbers: ");
//        double double1 = scanner.nextDouble();
//        double double2 = scanner.nextDouble();
//        System.out.printf("The bigger number is: %f", max(double1, double2));

//        int myNum = 10;
//        myNum = times2(myNum);
//        System.out.println(myNum);
//        boolean[] myBools = new boolean[10];

        int[] myNums = {1,2,45,4,5};
        int[] myOtherNums = new int[10];

        int[][] my2dArray = {
                {1,2,},
                {4,},
                {7,8,9},
                {7,8},
                {7,8,9,12},
                {7,8,9},
        };

        int[][] myOther2dArray= new int[5][];
        for(int i = 0; i <5; i++) {
            myOther2dArray[i] = new int[5];
        }
        printArray(myOther2dArray);
//
//        int[] joinedNums = concat(myNums, myOtherNums);
//
//        printArray(joinedNums);
//        System.out.println(myNums[5]);

//        printArray(myOtherNums);

//        printArray(myNums);
//
//        doubleValues(myNums);
//        System.out.println();
//
//        printArray(myNums);


    }

    public static int max(int val1, int val2) {
        if (val1 >= val2) {
            return val1;
        } else {
            return val2;
        }
    }

    public static double max(double val1, double val2) {
        if (val1 >= val2) {
            return val1;
        } else {
            return val2;
        }
    }

    public static int times2(int a) {
        return a * 2;
    }

    public static void printArray(int[] values) {
        for(int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }

    public static void printArray(boolean[] values) {
        for(int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }

    public static void printArray(String[] values) {
        for(int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
    public static void printArray(int[][] values) {
        for(int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
    public static void doubleValues(int[] values) {
        for(int i = 0; i < values.length; i++) {
            values[i] = values[i] * 2;
        }
    }

    public static int[] concat(int[] array1, int[] array2) {
        int newSize = array1.length + array2.length;
        int[] joinedArray = new int[newSize];
        for (int i = 0; i<array1.length; i ++) {
            joinedArray[i] = array1[i];
        }
        for (int i = array1.length; i< newSize; i ++) {
            joinedArray[i] = array2[i - array1.length];
        }
        return joinedArray;
    }
}
