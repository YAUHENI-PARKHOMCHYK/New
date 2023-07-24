import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lesson14 {
    public static void main(String[] args) {

        List<List<String>> countries = Arrays.asList(Arrays.asList("Warsaw","Wroclaw"),Arrays.asList("Brest", "Grodno"),
                Arrays.asList("Berlin", "Frankfurt"),Arrays.asList("Brest", "Minsk"));
        long countCities= countries.stream().flatMap(x->x.stream()).count();
        System.out.println(countCities);

        List<String> cities= countries.stream().flatMap(i->i.stream()).distinct().toList();
        System.out.println(cities);

        List<String> words = Arrays.asList("sfsdfgfd", "ssdfgfdhgdfh", "sdff", "sdf", "s");
        Map<String,Integer> wordsLength = words.stream().collect(Collectors.toMap(word->word, word->word.length()));
        System.out.println(wordsLength);

        String allWords = words.stream().filter(word->word.length()>3).collect(Collectors.collectingAndThen(Collectors.toList(), list-> list.toString()));
        System.out.println(allWords);

        String wordsWithSeparator = words.stream().collect(Collectors.joining("; "));
        System.out.println(wordsWithSeparator);

        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Avocado");
        Map<Character,Long> countByLength = fruits.stream().collect(Collectors.groupingBy((fruit)->fruit.charAt(0), Collectors.counting()));
        System.out.println(countByLength);


    }
}
