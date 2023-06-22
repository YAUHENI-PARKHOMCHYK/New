package lesson7;

import java.time.LocalDate;


public class Question implements Comparable<Question> {

    Integer identification;
    LocalDate createDate;
    String priority;
    String status;

    public Question(int identification, LocalDate createDate, String priority, String status) {
        this.identification = identification;
        this.createDate = createDate;
        this.priority = priority;
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Question{" +
                "identification=" + identification +
                ", createDate=" + createDate +
                ", priority='" + priority + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


    @Override
    public int compareTo(Question o) {
        return this.identification.compareTo(o.identification);
    }




}
