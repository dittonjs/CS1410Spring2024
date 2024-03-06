public class MyArrayList {

    int[] data = new int[0];
    int numElements = 0;

    public void add(int num) {
        numElements += 1;
        if(numElements >= data.length) {
            copyAndExpand();
        }
        data[numElements - 1] = num;
    }

    private void copyAndExpand() {
        int[] newData = new int[data.length  + 1];
        for(int i = 0 ; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public int get(int index) {
        return data[index];
    }

//    {1,2,,4,5, , , , , , , ,}

    public void remove(int at) {

    }
}
