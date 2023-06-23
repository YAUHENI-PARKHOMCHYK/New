package lesson8;

import java.util.Comparator;

public class EventComparator implements Comparator<Event> {
    @Override
    public int compare(Event o1, Event o2) {
        if(o1.priority.equals("EMERGENCY") && o2.priority.equals("NORMAL")) return -1;
        if(o1.priority.equals("NORMAL") && o2.priority.equals("EMERGENCY")) return 1;
        return 0;
    }

}
