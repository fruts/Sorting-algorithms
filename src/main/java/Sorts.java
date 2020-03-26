import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorts {
    public static void bubbleSort(int[] array) {
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
    public static int[] merge(int[] arr1, int[] arr2) {
        int  length1 = arr1.length, length2 = arr2.length;
        int a = 0, b = 0, length = length1+length2;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            if(b<length2 && a<length1) {
                if(arr1[a] > arr2[b]) result[i] = arr2[b++];
                else result[i] = arr1[a++];
            }   else if (b<length2) {
                result[i] = arr2[b++];
            }   else {
                result[i] = arr1[a++];
            }
        }
        return result;
    }
    public static int[] mergeSort(int[] array) {
        int length = array.length;
        if(length<2) return array;
        int middle = length/2;
        return merge(mergeSort(Arrays.copyOfRange(array, 0, middle)),
                mergeSort(Arrays.copyOfRange(array, middle, length)));
    }
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }
    static int partition(int[] array, int begin, int end) {
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    public static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);
    }
    public static void main(String[] args) {

    }
}
