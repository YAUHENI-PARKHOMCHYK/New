package org.example;

public class Emploee {
    String name;
    String department;
    String post;
    Integer salary;

    public Emploee(String name, String department, String post, Integer salary) {
        this.name = name;
        this.department = department;
        this.post = post;
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
}
