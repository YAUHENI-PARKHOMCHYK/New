package lesson13;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson13 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7,9,3,4,2,9,1,4,5,3,2,7);
//------------------------------------------------
        int digitCounter = 0;
        for(Integer i : list){
            if(i%2 ==0) digitCounter++;
        }
        System.out.println(digitCounter);
//----------------------------------------------------
        long count = list.stream().filter(i -> i%2 ==0).count();
        System.out.println(count);


        List<String> strings = Arrays.asList("abfsd", "abdfazz", "dsfdfasd", "abdfsazz");
        strings.stream().filter(s->s.startsWith("ab")).filter(s->s.endsWith("zz")).forEach(System.out::println);
        Set<String> res = strings.stream().filter(s->s.startsWith("ab")).filter(s->s.endsWith("zz")).collect(Collectors.toSet());
        System.out.println(res);

        Integer [] arr = list.stream().sorted().limit(3).toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));

        List<Integer> arrSet = list.stream().sorted((o1, o2) -> (-1)*o1.compareTo(o2)).distinct().limit(3).collect(Collectors.toSet()).stream().sorted((o1, o2) -> (-1)*o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(arrSet);

        list.stream().map(price -> price * 2).forEach(System.out::println);

        list.stream().map(price -> price * 2).filter(price-> price>=10).forEach(System.out::println);

        list.stream().mapToDouble(price -> price * 1.2).filter(price-> price>10).forEach(System.out::println);

        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        List<List<Integer>> listOfLists = Arrays.asList(list1,list2,list3);

        listOfLists.stream().flatMap(x-> x.stream()).map(e-> e*2).forEach(System.out::println);
    }
}
