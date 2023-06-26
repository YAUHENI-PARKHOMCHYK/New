package algoritms.homeworks.homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework6 {
    public static void main(String[] args) {

        num(7);
        num(8);
        int [] arr = {1,2,3,4};
        int [] nexArr = {1,1,1,1,1};
        sumArr(arr);
        sumArr(nexArr);
        System.out.println(triangle(5));

    }

    public static void sumArr(int [] arr){

        for(int i = 1; i<arr.length; i++){
            arr[i] = (arr[i] + arr[i-1]);
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void num(int num) {
        int x = num;
        while (x % 2 != 0) {
            x += num;
        }
        System.out.println(x);
    }
    public static List<List<Integer>> triangle(int numSize) {

        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstList = new ArrayList<>();

        firstList.add(1);
        triangle.add(firstList);

        for (int i = 1; i < numSize; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);

            row.add(1);

            for (int j = 1; j < i; j++) {
                int num = prevRow.get(j - 1) + prevRow.get(j);
                row.add(num);
            }

            row.add(1);
            triangle.add(row);
        }

        return triangle;
    }
}
