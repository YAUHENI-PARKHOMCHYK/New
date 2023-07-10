package lesson11;

import java.util.Arrays;
import java.util.LinkedList;

public class Node {

    String value;
    LinkedList<Edge> nodes = new LinkedList<>();

    public void print() {
        System.out.println(value);
        nodes.forEach((node) ->{
            System.out.println(node);
        });
    }


//    public void print() {
//        StringBuffer out = new StringBuffer();
//        out.append(value);
//        nodes.forEach(node -> {
//            out.append("->");
//            out.append(node.value);
//        });
//        System.out.println(out.toString());
//    }
}
