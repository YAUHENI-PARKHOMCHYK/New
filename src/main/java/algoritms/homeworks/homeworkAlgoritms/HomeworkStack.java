package algoritms.homeworks.homeworkAlgoritms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class HomeworkStack {
    public static void main(String[] args) {
        String sequence = "([{}])";
        String fg = "([)]";
        String s = "{()]";
    sequenceCheck(sequence);
    sequenceCheck(fg);
    sequenceCheck(s);

        LinkedList<Integer> asd = new LinkedList<>();
        asd.add(1);
        asd.add(2);
        asd.add(3);
        asd.add(3);
        asd.add(2);
        asd.add(1);

        System.out.println(linkList(asd));


    }
    public static void sequenceCheck(String str){
        Stack<Character> find = new Stack<>();
        int length = str.length()/2;
        int correctValue = 0;
        System.out.println(length);
        for (int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('){
                find.push(')');
                }if( ch == '{'){
                find.push('}');
            }if(ch=='['){
                find.push(']');
            }if(i>=length) {
                System.out.println("STACK " + find.peek());
                System.out.println("CH " + ch);
                if (ch == find.pop()) {
                    correctValue++;
                }
            }
        }
        if (correctValue==length) {
            System.out.println("Последовательность является правильной!");
        } else {
            System.out.println("Последовательность является не правильной!");
        }
    }
    public static boolean linkList(LinkedList<Integer> list){
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        int size = list.size()/2;
        if(list.isEmpty()){
            return true;
        }
        for(int i = 0; i<list.size(); i++){
            if(i<size) {
                queue.add(list.get(i));
            }else {
                stack.push(list.get(i));
            }
        }
        int i =0;
        while (!queue.isEmpty() && !stack.isEmpty()){
            if(!queue.remove().equals(stack.pop())){
                return false;
            }
        }
        return true;
    }
}



