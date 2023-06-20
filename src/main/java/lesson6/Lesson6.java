package lesson6;

import java.util.*;

public class Lesson6 {


    public static void main(String[] args) {
    example2();
    example3();
    }


    static void example2(){
        Document doc1 = new Document(1,"Документ1");
        Document doc2 = new Document(2,"Документ2");
        Document doc3 = new Document(3,"Документ3");
        Document doc4 = new Document(3,"Документ3");

        Set<Document> documents = new HashSet<>();
        documents.add(doc1);
        documents.add(doc2);
        documents.add(doc3);
        documents.add(doc4);

        System.out.println(documents);




        }
        static void example3(){
            Document docs1 = new Document(1,"Документ1");
            Document docs2 = new Document(2,"Документ2");
            Document docs3 = new Document(3,"Документ3");
            Document docs4 = new Document(3,"Документ3");


            SortedSet<Document> sort = new TreeSet<>();
            sort.add(docs1);
            sort.add(docs2);
            sort.add(docs3);
            System.out.println(sort);

            Document firstDoc = sort.first();
            Document secondDoc = sort.last();

            System.out.println(firstDoc);
            System.out.println(secondDoc);

        }

//        Set<String> flowers = new HashSet();
//        flowers.add("Роза");
//        String romOne = new String("Ромашка");
//        flowers.add("Гвоздика");
//        String romTwo = new String("Ромашка");
//
//        System.out.println(romOne==romTwo);
//        System.out.println(romOne.equals(romTwo));
//
//        System.out.println();
//        boolean isRomashkaExist =  flowers.add("Ромашка");
//        System.out.println("Добавилась ли ромашка? "+ isRomashkaExist);
//        System.out.println(flowers);
//        boolean isRosaExist = flowers.contains("Роза");
//        System.out.println("Есть ли Роза " + isRosaExist);
//        boolean isKolokolchikExist = flowers.contains("Колокольчик");
//        System.out.println("Есть ли колокольчик " + isKolokolchikExist);
//
//        flowers.remove("Роза");
//        flowers.remove("Колокольчик");
//
//        System.out.println(flowers);
//
//        Iterator<String> it = flowers.iterator();
//        while (it.hasNext()){
//            String flower = it.next();
//            System.out.println(flower);
//            it.remove();
//            System.out.println(flowers);
//        }
    }


