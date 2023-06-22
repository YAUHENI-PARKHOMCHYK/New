package lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Practic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> dir = new Stack<>();
        String scanIn = scanner.nextLine();
        dir.add(scanIn);
        String s = dir.peek();
        System.out.println(s);

        char [] newChars = new char[3];
        char [] dirChar = new char[3];
        s.getChars(0,s.length(),newChars,0);
        int j=0;
        for(int i = newChars.length-1; i>=0; i--){
            dirChar[j]=newChars[i];
            j++;
        }
        System.out.println(dirChar);
        String eq = String.valueOf(dirChar);
        String newScan = scanner.nextLine();

        System.out.println(eq.equals(newScan));
    }
}
