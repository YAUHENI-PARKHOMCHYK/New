package homeworks.homework2;

public class Brackets {
    String mathExpression;
    char [] dir;
    int rightBracketStart;
    int rightBracketEnd;
    int leftBracketStart;
    int leftBracketEnd;
    public Brackets(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "mathExpression='" + mathExpression + '\'' +
                '}';
    }

    public String correct(){
        rightBracketStart = mathExpression.indexOf(')');
        rightBracketEnd = mathExpression.lastIndexOf(')');
        leftBracketStart = mathExpression.indexOf('(');
        leftBracketEnd = mathExpression.lastIndexOf('(');


        if(rightBracketStart==-1 || (rightBracketEnd==rightBracketStart && leftBracketEnd!=leftBracketStart)) {
            return "Ошибка: не закрыта скобка";}
        if(leftBracketStart==-1 || (leftBracketEnd==leftBracketStart && rightBracketEnd!=rightBracketStart)) {
            return "Ошибка: не открыта скобка";
        }
        if((leftBracketEnd==leftBracketStart) && (rightBracketEnd==rightBracketStart)) {

            return "Ошибка: не открыта и не закрыта скобка";
        }

        return "Скобки открыты правильно";

    }



}
