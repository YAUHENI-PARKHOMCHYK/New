package lesson7;

import java.time.LocalDate;
import java.util.*;

public class Lesson7 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Set.of(99,33,11,22,66,4,21,12,2));
        System.out.println(nums);
        Collections.sort(nums, new IntegerComporator());
        System.out.println(nums);



        Cat cat1 = new Cat("Барсик", LocalDate.of(2021, 11,1),3);
        Cat cat2 = new Cat("Tom", LocalDate.of(2022, 10,1),5);
        Cat cat3 = new Cat("Рыжик", LocalDate.of(2019, 1,1),1);
        Cat cat4 = new Cat("Рыжик", LocalDate.of(2018, 1,1),1);

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

        System.out.println(cats);
        Collections.sort(cats,new CatsWeightComparator());
        System.out.println(cats);
    }
}
