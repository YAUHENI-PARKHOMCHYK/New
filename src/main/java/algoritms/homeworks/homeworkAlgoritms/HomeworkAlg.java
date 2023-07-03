package algoritms.homeworks.homeworkAlgoritms;

// Регистрация на сайте, сохранение логина и пароля будет использоваться динамический массив
// из за незнания количества пользователей.
import java.util.Arrays;

public class HomeworkAlg {
    public static void main(String[] args) {
    int [] array = {4,3,7,9,2,1,6,12,53,23};
        array = addSize(array,10);
        System.out.println(Arrays.toString(array));
    }
    public static int[] addSize(int [] arr , int sizeAdd){
        int size = arr.length+sizeAdd;
        int [] newArray = new int[size];
        int i = 0;
        for( int value : arr){
            newArray[i]=value;
            i++;
        }
        return newArray;
    }
}
