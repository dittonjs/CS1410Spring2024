import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        System.out.println(computeSum(nums));


        Person bob = new Person("Bob");
        Person alice = new Person("Alice");
        Person jeff = new Person("Jeff");
        Person doug = new Person("Doug");
        Person peter = new Person("Peter");
        Person john = new Person("John");
        Person aaron = new Person("Aaron");
        Person steven = new Person("Steven");

        HashMap<Person, ArrayList<Person>> following = new HashMap<>();
        ArrayList<Person> bobsFriends = new ArrayList<>();
        bobsFriends.add(alice);
        bobsFriends.add(doug);
        bobsFriends.add(steven);
        following.put(bob, bobsFriends);

        ArrayList<Person> alicesFriends = new ArrayList<>();
        alicesFriends.add(peter);
        alicesFriends.add(doug);
        alicesFriends.add(aaron);
        following.put(alice, alicesFriends);

        ArrayList<Person> aaronsFriends = new ArrayList<>();
        aaronsFriends.add(peter);
        aaronsFriends.add(jeff);
        aaronsFriends.add(john);
        aaronsFriends.add(bob);
        following.put(aaron, aaronsFriends);

        printFollowing(following, bob);

        char[][] world = {
                {'*','*','*','*','*','*','*','*'},
                {'*','A','*','*','*','B','*','*'},
                {'*','A','A','*','*','B','B','*'},
                {'A','A','A','*','*','*','B','B'},
                {'*','*','*','*','*','*','B','*'},
                {'*',' ','*','*',' ',' ','*','*'},
                {' ',' ','*','*',' ',' ','*','*'},
                {'*',' ','*','*',' ','*','*','*'},
        };

        findEmptyRegions(world);
        displayWorld(world);
    }

    public static void displayWorld(char[][] world) {
        for(char[] row: world) {
            for (char col: row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void findEmptyRegions(char[][] world) {
        char label = 'A';
        for(int row = 0; row<world.length; row++) {
            for(int col = 0; col<world[row].length; col++) {
                if (world[row][col] == ' ') {
                    // recursively label that space
                    labelSpace(world, row, col, label);
                    // update the label
                    label ++;
                }
            }
        }
    }

    private static void labelSpace(char[][] world, int row, int col, char label) {
        if (row >= world.length) return;
        if (row < 0) return;
        if (col >= world[row].length) return;
        if (col < 0) return;
        if (world[row][col] != ' ') return;

        world[row][col] = label;

        labelSpace(world, row + 1, col, label);
        labelSpace(world, row - 1, col, label);
        labelSpace(world, row, col + 1, label);
        labelSpace(world, row, col - 1, label);
    }

    public static int computeSum(int[] nums) {
        return computeSum(nums, 0);
    }

    private static int computeSum(int[] nums, int start) {
        if (start == nums.length) return 0;
        return nums[start] + computeSum(nums, start + 1);
    }

    // bob -> alice -> aaron -> bob -> alice -> aaaron

    public static int fib(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return fib(n - 1) + fib(n-2);
    }

    public static void printFollowing(HashMap<Person, ArrayList<Person>> following, Person person) {
        printFollowing(following, person, new ArrayList<>(), "");
    }
    private static void printFollowing(HashMap<Person, ArrayList<Person>> following, Person person, ArrayList<Person> done, String prefix) {
        System.out.println(prefix + person.getName());
        if (done.contains(person)) return;
        done.add(person);
        ArrayList<Person> followedList = following.get(person);

        if (followedList == null) return;
        for(Person followed: followedList) {
            printFollowing(following, followed, done, prefix + "    ");
        }
    }

    // f(n) = f(n-1) + f(n-2)

}

class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
