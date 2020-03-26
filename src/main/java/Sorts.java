public class Sorts {
    public static void BubbleSort(int[] array) {
        boolean isSorted = false;
        int buffer = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]) {
                    isSorted = false;
                    buffer = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buffer;
                }
            }
        }
    }
}
