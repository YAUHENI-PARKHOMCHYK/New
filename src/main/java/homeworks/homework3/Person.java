package homeworks.homework3;

public class Person {
    String firstName;
    String email;
    double salary;


    public Person(String firstName, String email, double salary) {
        this.firstName = firstName;
        this.email = email;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
