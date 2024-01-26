public class SearchAndSorting {
    public static void main(String[] args) {
        int[] data = {1,6,5,34,765,2,45,56,43,55,33,77,88};
        int[] bad = {10,9,8,7,6,5,4,3,2,1};
        int search = 34;
        if (linearSearch(data, search)) {
         System.out.printf("Found the value %d in data\n", search);
        } else {
         System.out.printf("Did not find the value %d in data\n", search);
        }

        int[] data2 = {1,2,3,5,8,13,21,34,234,345,5647,6789};
        int search2 = 5647;
        if (binarySearch(data2, search2)) {
            System.out.printf("Found the value %d in data\n", search2);
        } else {
            System.out.printf("Did not find the value %d in data\n", search2);
        }

        selectionSort(data);
        printArray(data);
    }

    public static boolean linearSearch(int[] data, int value) {
        for(int num: data) {
            if (num == value) return true;
        }
        return false;
    }

    public static boolean binarySearch(int[] data, int value) {
        boolean found = false;
        int start = 0;
        int end = data.length - 1;
        while(!found && start <= end) {
            int middle = (start + end) / 2;
            if (data[middle] == value) {
                found = true;
            } else if(data[middle] < value) { // value is on the "right side"
                start = middle + 1;
            } else { // value is on the "left side"
                end = middle - 1;
            }
        }
        return found;
    }

    public static void bubbleSort(int[] data) {
        boolean didSwap = false;

        do {
            didSwap = false;
            for(int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i+1]) {
                    didSwap = true;
                    //perform swap
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                }
            }
        } while(didSwap);

    }

    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length; i ++) {
            int smallest = i;
            for(int j = i; j < data.length; j++) {
                if(data[j] < data[smallest]) {
                    smallest = j;
                }
            }
            int temp = data[i];
            data[i] = data[smallest];
            data[smallest] = temp;
        }
    }

    public static void printArray(int[] data) {
        for(int num: data) {
            System.out.printf("%d, ", num);
        }
        System.out.println();
    }
}
