package algoritms.lessons;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int [] array = new int[]{1, 5, 6, 9, 3, 2, 4, 5, 1, 6};

       array =  mergeSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static int[] mergeSort(int[] array, int from, int to) {
        if (to <= from) {
            return new int[]{array[from]};
        }
        int middle = (to + from) / 2;

        int[] left = mergeSort(array, from, middle);
        int[] right = mergeSort(array, middle + 1, to);
        return merge(left, right);

    }
    private static int[] merge(int[] left, int[] right){
        var firstPointer = 0;
        var secondPointer = 0;
        int pointer = 0;
        var array = new int [left.length + right.length];
        while (firstPointer < left.length && secondPointer < right.length){
            if(left[firstPointer] > right[secondPointer]){
                array[pointer] = right[secondPointer];
                pointer++;
                secondPointer++;
            }else{
                array[pointer]=left[firstPointer];
                pointer++;
                firstPointer++;
            }
        }
        while (firstPointer < left.length){
            array[pointer] = left[firstPointer];
            pointer++;
            firstPointer++;
        }while (secondPointer< right.length){
            array[pointer] = right[secondPointer];
            pointer++;
            secondPointer++;
        }
        return array;
        }



}
