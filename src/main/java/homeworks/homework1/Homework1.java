package homeworks.homework1;

import java.util.*;

public class Homework1 {
    static Scanner scanner = new Scanner(System.in);
    static int summ = 0;

    static String book = "BOOK";
    static String magazine = "MAGAZINE";

    static List<Books> books = new ArrayList<>();
    static List<Magazines> magazines = new ArrayList<>();

    static List<Books> userBook = new ArrayList<>();

    static List<Magazines> userMagazine = new ArrayList<>();

    public static void main(String[] args) {


        books.add(new Books("War and peace", 123423, 300, 4));
        books.add(new Books("Heidi", 123423, 100, 4));
        books.add(new Books("The Secret Garden", 123423, 120, 4));
        books.add(new Books("The Invisible Man", 123423, 220, 2));

        magazines.add(new Magazines("The Time", 100, 2000, 4));
        magazines.add(new Magazines("The Guardian", 80, 2010, 1));
        magazines.add(new Magazines("The Daily Mail", 120, 2020, 6));
        magazines.add(new Magazines("The Economist", 100, 2000, 4));

        System.out.println("Введите ниже (book) или (magazine) в соответсвии с вашими интересами: ");

        String scan = scanner.nextLine().toUpperCase();




            if (scan.equals(book)) {
                bookChoice(books);
            }
            if (scan.equals(magazine)) {
                magazineChoice(magazines);
            }
            if (!(scan.equals(book)) || !(scan.equals(magazine))){
            System.out.println("Не корректно введена информация, введите ваш выбор еще раз!");

            scan = scanner.nextLine().toUpperCase();
            }


        System.out.println("Ваш выбор: " + userBook.toString() + userMagazine.toString());
        System.out.println("На сумму: ");

    }
        public static void bookChoice(List<Books> books){
            List<Integer>dirBooks = new ArrayList<>();

            int numb = 1;
           for(int i = 0; i<books.size(); i++) {
               String numbBook = String.valueOf(numb);
                System.out.println("(" + numbBook + ") " + books.get(i));
                numb++;
            }
            System.out.println("Введите номера книг которые вы хотите получить(для выхода введите 0, если желаете добавить к выбору журналы введите -1): ");



           for(int i = 0; i<books.size(); i++) {
               int choiceNumb = 0;
               int scanNumb = scanner.nextInt();

               if (scanNumb > choiceNumb ) {
                   if(dirBooks.contains(scanNumb)){
                       System.out.println("Вы уже выбрали эту Книгу! Выберите пожалуйста другую: ");
                       scanNumb = scanner.nextInt();

                   }

                   choiceNumb = scanNumb - 1;
                   userBook.add(books.get(choiceNumb));
                   System.out.println("Вы добавили: " + userBook.get(i));
                   int price = userBook.get(i).getPrice();
                   summ = summ + price;
                   System.out.println("Баланс выбранных предметов составляет: " + summ);
                   if(summ>1000){
                       System.out.println("Вы превысили допустимый баланс!");
                   }
                   dirBooks.add(i,scanNumb);
               }else if(scanNumb==-1){
                   magazineChoice(magazines);
               }
               if (scanNumb == 0) {
                   break;
               }
           }
           }
        public static void magazineChoice(List<Magazines>magazines){

            List<Integer>dirMagazine = new ArrayList<>();
                int numb = 1;
                for (int i = 0; i < magazines.size(); i++) {
                    String numbMagazines = String.valueOf(numb);
                    System.out.println("(" + numbMagazines + ") " + magazines.get(i));
                    numb++;
                }
                System.out.println("Введите номера журналов которые вы хотите получить(для выхода введите 0, если желаете добавить к выбору книги введите -1): ");



                for (int i = 0; i < magazines.size(); i++) {
                    int choiceNumb = 0;
                    int scanNumb = scanner.nextInt();

                    if (scanNumb > choiceNumb ) {
                        if(dirMagazine.contains(scanNumb)){
                            System.out.println("Вы уже выбрали этот журнал! Выберите пожалуйста другой: ");
                            scanNumb = scanner.nextInt();
                        }
                        dirMagazine.add(i,scanNumb);
                        choiceNumb = scanNumb - 1;
                        userMagazine.add(magazines.get(choiceNumb));
                        System.out.println("Вы добавили: " + userMagazine.get(i));
                        int price = userMagazine.get(i).getPrice();
                        summ = summ + price;
                        System.out.println("Баланс выбранных предметов составляет: " + summ);
                        if(summ>1000){
                            System.out.println("Вы превысили допустимый баланс!");
                        }
                    }else if(scanNumb ==-1){
                        bookChoice(books);
                    }
                    if (scanNumb == 0) {
                        break;
                    }
                }
            }


}


