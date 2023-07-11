package homeworks.homeworkLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class HomeworkLambda {
    public static void main(String[] args) {
    String s = "Hello123World456";
        clearString(s);
        int [] gh= {1, 2, 3, 4, 5};
        sum(gh);

    }
    interface Clear<T>{
        String clear(T t);
    }
    public static void clearString(String str){
        Clear<String> clearNum = ((x)->x.replaceAll("[^0-9]",""));
        String shortString = clearNum.clear(str);
        int numbers = Integer.parseInt(shortString);
        System.out.println(numbers);

    }
    public static void sum(int [] nums){

        List<Integer>numbers = new ArrayList<>();
        for(int value : nums){
            numbers.add(value);
        }
        int result = 1;
        for (int i =0; i<nums.length;i++) {
//            Function<Integer, Integer> sum = ((x, y) -> result += x);
        }
        for(int i = 0; i<nums.length; i++){
//            finalY = sum.apply(nums[i]);
        }
//        for(int summ: nums){
//            finalY = sum.apply(summ);
//        }
//        System.out.println(finalY);
//        Function<Integer,Integer> sum = ((x)-> x + y);

    }
}
