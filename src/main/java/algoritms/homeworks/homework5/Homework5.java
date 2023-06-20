package algoritms.homeworks.homework5;

public class Homework5 {
    public static void main(String[] args) {
        char[] chars = {'п','р','и','в','е','т'};
        String result = new String(chars);
        int index = 0;
        for(int i = result.length()-1; 0<=i; i--){
            chars[i] = result.charAt(index);
            index++;
        }
        System.out.println(chars);

    }


}
