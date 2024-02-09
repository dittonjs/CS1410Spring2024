public class Main {
    public static void main(String[] args) {
        // not gonna write this for now
        System.out.println("Asdflkjasdflkjasfd");
    }

    public static boolean binarySearch(int[] data, int searchValue) {
        int start = 0;
        int end = data.length - 1;
        boolean found = false;
        while(!found && start <= end) {
            int middle = (start + end) / 2;
            if (data[middle] == searchValue) {
                found = true;
            } else if(data[middle] > searchValue) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return found;
    }

}

class Dog {
    private String name;
    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
