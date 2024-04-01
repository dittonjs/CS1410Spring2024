public class Main {



    public static void main(String[] args) {
        int[] data = {1,4,34,455,6767,787878,456456456};
        System.out.println(binarySearchRecursive(data, 500000000));
        int[] data2 = {4,3,6,7,4,2,34,76,456,2,34,42,4576,54765,6324,2,134};
        System.out.println(searchRecursive(data2, 4577));

        int[] data3 = {12, 34, 1, 55, 38};
        // 1 12 34 55 38

        quickSort(data2);

        for (int value: data2) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 45 23 37 55 11 18 76
    // pick value 37
    // 37 45 23 55 11 18 76
    // index 3
    // 37 23 11 18 45 55 76
    // 18 23 11 37 45 55 76
    // 23 18 11 ...
    // index 2
    // 23 18 11
    //        ^
    // 11 18 23

    public static void quickSort(int[] data) {
        quickSort(data, 0, data.length - 1);
    }

    private static void quickSort(int[] data, int start, int end) {
        if (start > end) return;
        int pivotIndex = partition(data, start, end);
        quickSort(data, pivotIndex + 1, end);
        quickSort(data, start, pivotIndex - 1);
    }

    private static int partition(int[] data, int start, int end) {
        int mid = (start + end) / 2;
        int pivotValue = data[mid];
        // swap the pivot value with the start of the array
        data[mid] = data[start];
        data[start] = pivotValue;

        // create the 2 partitions
        int pivotIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (data[i] < pivotValue) {
                pivotIndex ++;
                int temp = data[i];
                data[i] = data[pivotIndex];
                data[pivotIndex] = temp;
            }
        }

        // swap the pivot value to its correct place
        int temp = data[start];
        data[start] = data[pivotIndex];
        data[pivotIndex] = temp;

        return pivotIndex;
    }

    public static boolean searchRecursive(int[] data, int value) {
        return searchRecursive(data, value, 0, data.length - 1);
    }

    private static boolean searchRecursive(int[] data, int value, int start, int end) {
        if (start > end) return false;
        int mid = (start + end) / 2;
        if (data[mid] == value) return true;
        return searchRecursive(data, value, mid + 1, end) || searchRecursive(data, value, start, mid - 1);
    }

    public static boolean binarySearchRecursive(int[] data, int value) {
        return binarySearchRecursive(data, value, 0, data.length - 1);
    }

    private static boolean binarySearchRecursive(int[] data, int value, int start, int end) {
        if (start > end) return false;
        int mid = (start + end) / 2;
        if (data[mid] == value) return true;

        if (value > data[mid]) { // search right
            return binarySearchRecursive(data, value, mid + 1, end);
        } else { // search left
            return binarySearchRecursive(data, value, start, mid - 1);
        }
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
}


