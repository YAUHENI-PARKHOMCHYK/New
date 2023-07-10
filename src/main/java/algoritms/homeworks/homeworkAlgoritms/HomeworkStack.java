package algoritms.homeworks.homeworkAlgoritms;

import java.util.Stack;

public class HomeworkStack {
    public static void main(String[] args) {
        String sequence = "([{}])";
        String fg = "([)]";
        String s = "{()]";
    sequenceCheck(sequence);
    sequenceCheck(fg);
    sequenceCheck(s);

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
}
