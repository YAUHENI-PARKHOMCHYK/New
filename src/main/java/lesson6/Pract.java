package lesson6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pract {
    public static void main(String[] args) {
    Set<String> colors = new HashSet<>();

        colors.add("Красный");
        colors.add("Оранжевый");
        colors.add("Желтый");
        colors.add("Зеленый");
        colors.add("Голубой");
        colors.add("Синий");
        colors.add("Фиолетовый");
        System.out.println(colors);
        Iterator<String> iterator = colors.iterator();

        while (iterator.hasNext()){
           String color = iterator.next();
            System.out.println(color);
        }
}
}
