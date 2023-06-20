package lesson7;

import java.time.LocalDate;
import java.util.Date;

public class Cat implements Comparable<Cat> {
    String name;
    LocalDate birthday;
    Integer weight;

    public Cat(String name, LocalDate birthday, Integer weight) {
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", weight=" + weight +
                '}';
    }


    @Override
    public int compareTo(Cat o) {
        if(this.name.compareTo(o.name)== 0){
            return this.birthday.compareTo(o.birthday);
        }else {
        return this.name.compareTo(o.name);
        }
    }


}
