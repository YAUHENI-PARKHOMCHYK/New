package algoritms.homeworks.homework5;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {
        char[] chars = {'п','р','и','в','е','т'};
        recChar(chars);

       boolean [] arrBoolean1 = {true,true,true,true,true,false,false};
       boolean [] arrBoolean2 = {true,false,false,false,false,false,false};
       boolean [] arrBoolean3 = {false,false,false,false,false,false,false};
       boolean [] arrBoolean4 = {true,true,true,true,true,true,true};

        System.out.println(firstFailedVersion(arrBoolean1));
        System.out.println(firstFailedVersion(arrBoolean2));
        System.out.println(firstFailedVersion(arrBoolean3));
        System.out.println(firstFailedVersion(arrBoolean4));

        int [] arr1 = {100, 112, 256, 349, 770};
        int [] arr2 = {72, 86, 113, 119, 265, 445, 892};

        confluence(arr1,arr2);
        int [] numbers = {0,1,0,3,12};
        changeIndexForZeroInTail(numbers);
        System.out.println(Arrays.toString(numbers));

    }
    public static void recChar(char [] chars){
        String result = new String(chars);
        int index = 0;
        for(int i = result.length()-1; 0<=i; i--){
            chars[i] = result.charAt(index);
            index++;
        }
        System.out.println(chars);
    }

    public static int firstFailedVersion(boolean[] successVersions){
        for(int i = 0; i<successVersions.length; i++){
            if(successVersions[i]==false){
                return i;
            }
        }
     return -1;
    }

    public static void confluence(int [] firstArr, int [] secondArr){
        int i = 0;
        int j = 0;
        int size = firstArr.length + secondArr.length;
        int [] array = new int[size];
        for(int index = 0; index<array.length; index++) {
            if (firstArr[i] < secondArr[j]) {
                array[index] = firstArr[i];
                if(i<firstArr.length-1){
                    i++;
                }
                if(i==firstArr.length-1 && array[index-1]==firstArr[i]){
                    array[index] = secondArr[j];
                }
            } else if(secondArr[j]<firstArr[i]){
                array[index] = secondArr[j];
                if(j< secondArr.length-1) {
                j++;
                }
                if(j==secondArr.length-1 && array[index-1]==secondArr[j]){
                    array[index] = firstArr[i];
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void changeIndexForZeroInTail(int [] arr) {
        int dir = 0;
        int j = 0;
        for (int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
                if(j<i){
                    dir = arr[i];
                    arr[i] = arr[j];
                    arr[j] = dir;
                }
                j++;
            }
        }
    }

}
