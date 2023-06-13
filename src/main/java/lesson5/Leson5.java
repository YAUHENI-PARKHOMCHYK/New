package lesson5;

import java.util.LinkedList;

public class Leson5 {
    public static void main(String[] args) {

        LinkedList<String> doc = new LinkedList<>();

        doc.addLast("Hello");
        doc.addLast("Friend");
        doc.addLast("Time");
        doc.addLast("Music");
        doc.addLast("World");
        doc.addLast("Man");

        System.out.println(doc);
        int size = doc.size();
        for(int i = 0; i< size;i++){
            System.out.println(doc.getFirst());
            doc.removeFirst();
        }

    }
}
