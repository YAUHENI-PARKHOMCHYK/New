package lesson8;

import java.util.Comparator;

public class Event implements Comparable <Event>{
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
    public int compareTo(Event o) {
        if(this.priority.equals("EMERGENCY") && !o.priority.equals("EMERGENCY")) return -1;
        if(!this.priority.equals("EMERGENCY") && o.priority.equals("EMERGENCY")) return 1;
        return 0;
    }
}
