package homeworks.homeworkStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Food {
    public static void main(String[] args) {


    List<Menu> dishes = Arrays.asList(new Menu("Котлета по Киевски", "Мясо", 220),
            new Menu("Куриная отбивная", "Мясо", 120),
            new Menu("Лосось запеченый", "Рыба", 95),
            new Menu("Штрудель", "Тесто", 190),
            new Menu("Эклер","Тесто", 140),
            new Menu("Карп фаршированный", "Рыба", 150),
            new Menu("Кекс","Тесто", 110),
            new Menu("Колбаски охотничьи","Мясо", 200),
            new Menu("Круасан","Тесто", 120),
            new Menu("Скумбрия на гриле", "Рыба", 70),
            new Menu("Паста с соусом песто","Тесто", 140));

    Map<Object,Long> caloriesFood = dishes.stream().filter(cal->cal.kKal>100).collect(Collectors.groupingBy((ingredient)->ingredient.mainIngredient, Collectors.counting()));

        System.out.println(caloriesFood);
    }

}
