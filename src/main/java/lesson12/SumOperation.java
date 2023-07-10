package lesson12;

import java.util.function.ToDoubleBiFunction;

public class SumOperation implements ToDoubleBiFunction<Double, Double> {


    @Override
    public double applyAsDouble(Double arg1, Double arg2) {
        return arg1 + arg2;
    }
}
