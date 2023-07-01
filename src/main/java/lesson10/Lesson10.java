package lesson10;

import java.util.*;

public class Lesson10 {
    public static void main(String[] args) {

        UserProfile sergey = new UserProfile("Sergey", "sergey@mail.com");
        UserProfile viktor = new UserProfile("Viktor", "viktor@mail.com");
        UserProfile ivan = new UserProfile("Ivan", "ivan@mail.com");
        UserProfile anonim = sergey;

        TreeMap<String, UserProfile> indexById = new TreeMap<>();
        indexById.put(sergey.id, sergey);
        indexById.put(viktor.id, viktor);
        indexById.put(ivan.id, ivan);

        System.out.println(indexById);
        System.out.println("По идентификатору: " + viktor.id + " найден профиль " + indexById.get(viktor.id));

        if(indexById.containsValue(anonim)){
            Set<Map.Entry<String, UserProfile>> keyValues = indexById.entrySet();
            keyValues.forEach(entry ->{
                if(entry.getValue().equals(anonim)){
                    System.out.println("Пользователь найден, его ключ = " +entry.getKey());
                }
            });
//            Collection<UserProfile> users = indexById.values();
//            users.forEach(userProfile -> {
//                if(userProfile.equals(anonim)){
//
//                }
        }else {
            System.out.println("Элемента нет в дереве! ");
        }

        TreeMap<String, UserProfile> indexByLogin = new TreeMap<>();
        indexByLogin.put(sergey.login, sergey);
        indexByLogin.put(viktor.login, viktor);
        indexByLogin.put(ivan.login, ivan);

        System.out.println("По логиу 'sergey' найден профиль " + indexByLogin.get("Sergey"));
    }
}
