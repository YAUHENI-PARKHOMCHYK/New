package lesson7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        Question task1 = new Question(2, LocalDate.of(2022,3,14),"LOW","FIXED");
        Question task2 = new Question(9, LocalDate.of(2023,5,7),"NORMAL","OPEN");
        Question task3 = new Question(3, LocalDate.of(2021,9,16),"LOW","FIXED");
        Question task4 = new Question(5, LocalDate.of(2022,5,24),"HIGH","FIXED");
        Question task5 = new Question(4, LocalDate.of(2023,2,1),"NORMAL","FIXED");
        Question task6 = new Question(1, LocalDate.of(2023,4,11),"HIGH","OPEN");
        Question task7 = new Question(8, LocalDate.of(2021,3,17),"LOW","OPEN");


        List<Question> questions = new ArrayList<>();
        questions.add(task1);
        questions.add(task2);
        questions.add(task3);
        questions.add(task4);
        questions.add(task5);
        questions.add(task6);
        questions.add(task7);


        System.out.println(questions);
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
        Collections.sort(questions);
        System.out.println(questions);
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||");
//        Collections.sort(questions, Comparator.comparing(q -> q.createDate));
        Collections.sort(questions, new TaskDateComparator());
        System.out.println(questions);
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
        Collections.sort(questions, new TaskPriorityComparator());
        System.out.println(questions);

    }
}
