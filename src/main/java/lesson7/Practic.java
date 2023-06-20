package lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practic {
    public static void main(String[] args) {


        People man1 = new People("abc", "last");
        People man2 = new People("pklz", "yelp");
        People man3 = new People("rpng", "note");
        People man4 = new People("ppza", "xyz");

        List<People> people = new ArrayList<>();
        people.add(man1);
        people.add(man2);
        people.add(man3);
        people.add(man4);
        System.out.println(people);
        Collections.sort(people);
        System.out.println(people);
    }
}
