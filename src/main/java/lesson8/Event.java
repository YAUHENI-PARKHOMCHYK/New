package lesson8;

import java.util.Comparator;

public class Event implements Comparator<Event> {
    String payload;
    String priority;

    public Event(String payload, String priority) {
        this.payload = payload;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Event{" +
                "payload='" + payload + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }


    @Override
    public int compare(Event o1, Event o2) {
        if(o1.priority.equals("EMERGENCY") && o2.priority.equals("NORMAL")) return -1;
        if(o1.priority.equals("NORMAL") && o2.priority.equals("EMERGENCY")) return 1;
        return 0;
    }
}
