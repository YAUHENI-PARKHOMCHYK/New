package lesson6;

import java.util.*;

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
        SortedSet<String> set = new TreeSet<>();
        while (iterator.hasNext()){
           String color = iterator.next();
            System.out.println(color);
            set.add(color);
        }
        System.out.println(set);



        String text = "Понятие «содержание высказывания» связано с категорией информативности речи и присуще только тексту. Оно сообщает читателю индивидуально-авторское понимание отношений между явлениями, их значимости во всех сферах придают ему смысловую цельность.";
        String [] textUp = text.toUpperCase().split(" ");
        Set<String> textSet = new HashSet<>();

        int words = 0;
        for(int i = 0; i<textUp.length; i++){
            textSet.add(textUp[i]);
            System.out.println(textUp[i]);
            boolean bool = textSet.add(textUp[i]);
            if(bool==false){
                words++;
            }
        }

        System.out.println(textSet);
        System.out.println(words);

        String df = "Hello";
        System.out.println(df.length());




}
}
