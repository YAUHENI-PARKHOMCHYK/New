package lesson6;

import java.util.Objects;

public class Document {
    int number;
    String title;

    public Document(int number, String title) {
        this.number = number;
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() !=getClass()) return false;
            Document doc = (Document) obj;

        return number == doc.number && Objects.equals(title,doc.title) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number,title);
    }

    @Override
    public String toString() {
        return "Document{" +
                "number=" + number +
                ", title='" + title + '\'' +
                '}';
    }
    public int compareTo(Document o){
        if(this.number < o.number)return 1;
        if(this.number > o.number)return -1;
        if(this.number == o.number)return 0;
        return 0;
    }
}
