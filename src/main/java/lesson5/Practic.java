package lesson5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Practic {
    public static void main(String[] args) {

        long startMills = System.currentTimeMillis();

        Random random = new Random(1000);
        int value = random.nextInt();
        LinkedList<Integer> test = new LinkedList<>();

        for(int i = 0; i<10000;i++){
        test.addLast(value);
        }
        long endMills = System.currentTimeMillis();

        System.out.println("Программа работала: " + (endMills - startMills));
    }
}
