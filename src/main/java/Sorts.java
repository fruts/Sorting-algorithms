import org.w3c.dom.ls.LSOutput;

public class Sorts {
    public static void BubbleSort(int[] array) {
        boolean isSorted = false;
        int buffer = 0;
        System.out.println("Bubble sorting start");
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println("");
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]) {
                    isSorted = false;
                    buffer = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buffer;
                }
            }
        }
        System.out.println("Bubble sorting end");
    }

    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        BubbleSort(array);
    }
}
