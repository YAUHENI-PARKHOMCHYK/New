package lesson7;

import java.util.Comparator;

public class TaskPriorityComparator implements Comparator<Question> {

    @Override
    public int compare(Question o1, Question o2) {

            if (o1.getStatus().equals("OPEN") && !o2.getStatus().equals("OPEN")) {
            return -1;
            } else if (!o1.getStatus().equals("OPEN") && o2.getStatus().equals("OPEN")) {
            return 1;}
            if (o1.getPriority().equals("HIGH") && !o2.getPriority().equals("HIGH")) {
            return -1;
            } else if (!o1.getPriority().equals("HIGH") && o2.getPriority().equals("HIGH")) {
            return 1;
            } else if(o1.getPriority().equals("NORMAL") && o2.getPriority().equals("LOW")) {
            return -1;
            } else if (o2.getPriority().equals("LOW") && o2.getPriority().equals("NORMAL")) {
            return 1;
            }

        return 0;
    }
}
