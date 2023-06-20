package lesson7;

public class People implements Comparable<People>{
    String firstName;
    String lastName;

    public People(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "People{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(People o) {
        if (this.firstName.compareTo(o.firstName) == 0) {
            return this.lastName.compareTo(o.lastName);
        } else {
            return this.firstName.compareTo(o.firstName);
        }
    }
}
