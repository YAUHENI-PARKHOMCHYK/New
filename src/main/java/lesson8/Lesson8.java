package lesson8;

import homeworks.homework3.Person;

import java.util.*;

public class Lesson8 {

    public interface lFNames<String,Double>{

    }


    public static void main(String[] args) {

        Queue<Event> quality = new PriorityQueue<>();

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
    public static void info(Queue<Event> events){
        while (!events.isEmpty()){
            System.out.println(events.poll());
        }
    }
}
