package homeworks.homework2;

import lesson8.Event;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public class Homework2 {
    public static void main(String[] args) {

        Queue<Stack> stacks = new ArrayDeque<>();
        Stack stack1 = new Stack("(2 + 3) * (5 - 2)");
        Stack stack2 = new Stack("(2 + 3 * (5 - 2)");
        Stack stack3 = new Stack("2 + 3) * (5 - 2");

        stacks.add(stack1);
        stacks.add(stack2);
        stacks.add(stack3);

        info(stacks);

    }

    public static void info(Queue<Stack> stacks){


        while (!stacks.isEmpty()){
            System.out.println(stacks.poll());
            for(int i = 0; i<stacks.size()-1; i++){

            }
        }
    }
}
