package lesson7;

import java.util.Comparator;

public class CatsWeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {

        return o2.weight - o1.weight;
    }
}
