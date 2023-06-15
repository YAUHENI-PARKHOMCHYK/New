package lesson6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lesson6 {
    public static void main(String[] args) {
        Set<String> flowers = new HashSet();
        flowers.add("Роза");
        flowers.add("Ромашка");
        flowers.add("Гвоздика");

        boolean isRomashkaExist =  flowers.add("Ромашка");
        System.out.println("Добавилась ли ромашка? "+ isRomashkaExist);
        System.out.println(flowers);
        boolean isRosaExist = flowers.contains("Роза");
        System.out.println("Есть ли Роза " + isRosaExist);
        boolean isKolokolchikExist = flowers.contains("Колокольчик");
        System.out.println("Есть ли колокольчик " + isKolokolchikExist);

        flowers.remove("Роза");
        flowers.remove("Колокольчик");

        System.out.println(flowers);

        Iterator<String> it = flowers.iterator();
        while (it.hasNext()){
            String flower = it.next();
            System.out.println(flower);
            it.remove();
            System.out.println(flowers);
        }
    }
}
