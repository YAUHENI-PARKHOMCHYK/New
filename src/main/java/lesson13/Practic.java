package lesson13;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
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

    }
}
