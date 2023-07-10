package lesson10;

import javax.swing.tree.TreeNode;
import java.util.*;

public class Practic {
    public static void main(String[] args) {
        String text = "Здравствуй мой милый друг";
        System.out.println(translate(text));


    }
    public static String translate(String str){
        TreeMap<String, String> translator = new TreeMap<>();
        translator.put("друг", "friend");
        translator.put("мой", "my");
        translator.put("Здравствуй", "Hello");
        translator.put("Мир", "World");

        String [] words = str.split(" ");

        String newText = "";

        for (int i =0; i<words.length; i++) {
            String engWord = translator.get(words[i]);
            if (translator.get(words[i]) ==null) {
            engWord = words[i];
            }
            newText += engWord + " ";
        }
        return newText;
    }

}
