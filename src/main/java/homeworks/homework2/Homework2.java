package homeworks.homework2;

public class Homework2 {
    public static void main(String[] args) {

        Stack stack1 = new Stack("(2 + 3) * (5 - 2)");
        Stack stack2 = new Stack("(2 + 3 * (5 - 2)");
        Stack stack3 = new Stack("2 + 3) * (5 - 2)");
        Stack stack4 = new Stack("2 + 3) * (5 - 2");

        System.out.println(stack1.correct());
        System.out.println(stack2.correct());
        System.out.println(stack3.correct());
        System.out.println(stack4.correct());

    }

}
