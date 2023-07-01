package homeworks.homework2;

public class Stack implements Comparable<Stack>{
    String mathExpression;

    char [] dirStart;
    char [] dirEnd;
    public Stack(String mathExpression) {
        this.mathExpression = mathExpression;
        this.mathExpression.getChars(0,mathExpression.length()-1,dirStart,0);

    }

    @Override
    public String toString() {
        return "Stack{" +
                "mathExpression='" + mathExpression + '\'' +
                '}';
    }

    @Override
    public int compareTo(Stack o) {
        if(this.dirStart.equals('(') && !o.dirStart.equals(')')) return Integer.parseInt("Ошибка: не закрыта скобка");
        if(!this.dirStart.equals('(') && o.dirStart.equals(')')) return Integer.parseInt("Ошибка: не открыта скобка");
        return Integer.parseInt("Скобки открыты правильно");
    }
}
