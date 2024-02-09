import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int age = 10;

        Integer someNum = 10;
        Long l = 123123123123123L;
        double myDouble = convertToDouble(age);
        System.out.println(myDouble);

        long newNum = someNum + l;

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(13);
        nums.add(234);
        nums.add(1345);
        nums.add(1456);
        nums.remove(3);
        nums.get(0);

    }

    public static double convertToDouble(Number number) {
        return number.doubleValue();
    }
}
