package lesson12;

import java.util.List;
import java.util.function.Function;

public class Practic {
    static String text = "Hello my little friend, this is Java";
    static String ch = "!";
    public static void main(String[] args) {

        Lambda<String, String> addCh = (t,e)-> System.out.println(t + e);
        String [] fd = text.split(" ");
        for(String s : fd){
            addCh.apply(s,ch);
        }

    }
    interface Lambda<T, E> {
        void apply (T t, E e);
    }


}
