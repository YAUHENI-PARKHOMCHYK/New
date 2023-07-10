package lesson12;

import java.util.function.ToDoubleBiFunction;

public class Calculator {
    Double arg1;
    Double arg2;
    Double result;

    public void inputArguments(Double arg1, Double arg2){
        this.arg1 = arg1;
        this.arg2 = arg2;
        System.out.println("Агрументы введены ");
        validateArguments();
    }

    public void validateArguments(){
        if(arg1 == null || arg2 == null){
            System.out.println("Значение аргументов не валидно! ");
        }else {
            System.out.println("Аргументы успешно провалидированы ");
        }
    }

    public void makeOperation(ToDoubleBiFunction<Double, Double> operation){
        result = operation.applyAsDouble(arg1,arg2);
        System.out.println("Операция " + operation + " успешно применена к аргументам");
        printResult();
    }

//    public void sum(){
//        result = arg1+arg2;
//    }
//
//    public void pow(){
//        result = Math.pow(arg1,arg2);
//    }

    public void printResult(){
        System.out.println("Результат операции: " + result);
    }
}
