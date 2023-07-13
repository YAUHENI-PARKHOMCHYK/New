package lesson13;

import java.util.*;
import java.util.stream.Collectors;

public class Practic {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("a1", "b5", "a2", "b4");
        String sd = elements.stream().min(String::compareTo).toString();
        System.out.println(sd);

        List<Integer> numbers = Arrays.asList(1, 12, 3, 10, 12, 17);
        List<Integer> oddNumbers = numbers.stream().filter(x-> x%2!=0).collect(Collectors.toList());
        System.out.println(oddNumbers);

        List<Integer> numbs = Arrays.asList(1, 12, 3, 10, 12, 17);
        numbs.stream().mapToDouble(x-> x*1.2).forEach(System.out::println);


        List<String> strings = Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");
        long count = strings.stream().filter(s->s.contains("Big")).count();
        System.out.println(count);

        List<String> elem = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        Set<String> sortElem = elem.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toSet());
        System.out.println(sortElem);


        List<Integer> values = Arrays.asList(2,5,3,6,1,9,7,8,15,11);
        long sum = values.stream().reduce(0,(x,y)->x+y);
        double midleValue = values.stream().reduce(0,(x,y)->(x+y)).doubleValue()/values.size();

        System.out.println(sum);
        System.out.println(midleValue);

        Person person1 = new Person("Yauheni");
        Person person2 = new Person("Valery");
        Person person3 = new Person("Natallia");
        Person person4 = new Person("Svetlana");


        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        List<Person>sortedNames = people.stream().sorted((o1, o2) -> o1.name.compareTo(o2.name)).toList();
        System.out.println(Arrays.toString(sortedNames.toArray()));


        List<String> text = Arrays.asList(
        "Hello my Friend",
        "Where are you my dear Friend",
        "Hello world");


        List<String> saveStrings = text.stream().flatMap(x-> Arrays.stream(x.split(" "))).distinct().toList();
        System.out.println(saveStrings);

        long countStrings = text.stream().flatMap(x-> Arrays.stream(x.split(" "))).distinct().count();
        System.out.println(countStrings);

        Optional<String> qwe = text.stream().flatMap(x-> Arrays.stream(x.split(" "))).distinct().max(Comparator.comparing(String::length));
        System.out.println(qwe);

        List<String> sortText = text.stream().sorted((o1, o2)->(o2.split(" ").length - o1.split(" ").length)).toList();
        System.out.println(sortText);
    }
}
