package lesson7;

import java.time.LocalDate;
import java.util.Comparator;

public class TaskDateComparator implements Comparator<Question> {

    @Override

    public int compare(Question o1, Question o2) {
        return o2.createDate.compareTo(o1.createDate);
    }


}
