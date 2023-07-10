package lesson12;

import java.util.function.ToDoubleBiFunction;

public class PowOperation implements ToDoubleBiFunction<Double, Double> {

    @Override
    public double applyAsDouble(Double arg1, Double arg2) {
        return Math.pow(arg1,arg2);
    }
}
