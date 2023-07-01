package lesson9;

import java.util.*;

public class Practic2 {
    public static void main(String[] args) {
        String string = "dsfsdf sdf sdhgf rttr";
        Character [] charsString = new Character[string.length()];



        System.out.println(Arrays.toString(charsString));
        Map<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i<charsString.length; i++){
            chars.put(charsString[i], i);
        }

        for(int i = 0; i<chars.size();i++){
            Character ch = string.charAt(i);
            if(chars.containsKey(ch)){
                Integer count = chars.get(ch);
                count++;
                chars.put(ch,count);
            }else{
                chars.put(ch,1);
            }
        }


        //////////////////////////////////////////////////////////////////////////////

        Map<String,String> str = new HashMap<>();
        str.put("Berlin", "London");
        str.put("Tokyo", "Seoul");
        str.put("Mumbai", "Berlin");
        str.put("Seoul", "Mumbai");

        Set<String> keys = str.keySet();
        List<String> startCity = new ArrayList<>();
        List<String> endCity = new ArrayList<>();
        startCity.addAll(keys);

        int j =0;
        for(int i = 0; i<startCity.size(); i++){

            if(!str.containsValue(startCity.get(i))){
                System.out.print(startCity.get(i) + " -> " + str.get(startCity.get(i)) + " ");
                endCity.add(str.get(startCity.get(i)));
            }
            else if(str.containsKey(endCity.get(j))){
                System.out.print(endCity.get(j) + " -> " + str.get(endCity.get(j)) + " ");
                endCity.add(str.get(endCity.get(j)));
                j++;
            }
        }
    }
}
