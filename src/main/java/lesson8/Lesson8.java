package lesson8;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;

public class Lesson8 {
    public static void main(String[] args) {

        PriorityQueue<Event> quality = new PriorityQueue<>();

        Event event1 = new Event("Включит телевизор", "NORMAL");
        Event event2 = new Event("Пожар", "EMERGENCY");
        Event event3 = new Event("Активация робота пылесоса", "NORMAL");
        Event event4 = new Event("Вскипятить чайник", "NORMAL");
        Event event5 = new Event("Потоп", "EMERGENCY");

        quality.add(event1);
        quality.add(event2);
        quality.add(event3);
        quality.add(event4);
        quality.add(event5);

        info(quality);

    }
    public static void info(PriorityQueue<Event> events){
        while (!events.isEmpty()){
            System.out.println(events.poll());
        }
    }
}
