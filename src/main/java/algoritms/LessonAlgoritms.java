package algoritms;

import java.util.List;
import java.util.Stack;

public class LessonAlgoritms {
    public static void main(String[] args) {
        Integer [] numbs = {3, 1, 7, 9, 9, 5};
        Stack<Integer> numb = new Stack<>();
        numb.addAll(0, List.of(numbs));
        String result ="";
        int dir = numbs[0];
        for (int i = 0; i<numbs.length; i++){
            for (int j =0; j<numbs.length;j++){
            if(numbs[j]>dir) {
                dir = numbs[j];
                numbs[j]=-1;
                }
            }
            result= result+dir;
        }
        System.out.println(result);
            //   созадем массив чисел
            //   создаем пустую строку для результата
            //   запуск цикла на проверку максимального числа в массиве
            //   максимальное число из массива записываем в строку
            //   удаление числа после записи
            //   по окончании цикла выводим результат
    }
}
