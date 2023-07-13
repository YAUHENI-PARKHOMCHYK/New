import java.util.Arrays;
import java.util.List;

public class Lesson14 {
    public static void main(String[] args) {

        List<List<String>> countries = Arrays.asList(Arrays.asList("Warsaw","Wroclaw"),Arrays.asList("Brest", "Grodno"),
                Arrays.asList("Berlin", "Frankfurt"),Arrays.asList("Brest", "Minsk"));
        long countCities= countries.stream().flatMap(x->x.stream()).count();
        System.out.println(countCities);

        List<String> cities= countries.stream().flatMap(i->i.stream()).distinct().toList();
        System.out.println(cities);
    }
}
