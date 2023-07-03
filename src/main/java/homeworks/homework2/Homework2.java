package homeworks.homework2;

import java.util.Stack;

public class Homework2 {
    public static void main(String[] args) {

        Brackets stack1 = new Brackets("(2 + 3) * (5 - 2)");
        Brackets stack2 = new Brackets("(2 + 3 * (5 - 2)");
        Brackets stack3 = new Brackets("2 + 3) * (5 - 2)");
        Brackets stack4 = new Brackets("2 + 3) * (5 - 2");

        System.out.println(stack1.correct());
        System.out.println(stack2.correct());
        System.out.println(stack3.correct());
        System.out.println(stack4.correct());
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.println(findBracket("(2 + 3) * (5 - 2)"));
        System.out.println(findBracket("(2 + 3 * (5 - 2)"));
        System.out.println(findBracket("2 + 3) * (5 - 2)"));
        System.out.println(findBracket("2 + 3) * (5 - 2"));
    }
    public static String findBracket(String str){
        Stack<Character> stack = new Stack<>();
        int rightBracket = 0;
        int leftBracket = 0;
        for(char ch : str.toCharArray()){
            if(ch =='('){
                leftBracket++;
            }
            if(ch==')'){
                rightBracket++;
            }
        }
        if(rightBracket>leftBracket && leftBracket%2!=0) return "Ошибка: не открыта скобка";
        else if(rightBracket<leftBracket && rightBracket%2!=0) return "Ошибка: не закрыта скобка";
        else if(rightBracket!=0 && leftBracket!=0) return "Ошибка: не закрыта и не открыта скобка";
        else return "Скобки открыты правильно";
    }

}
