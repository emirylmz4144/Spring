package CalculatorExample.ClassesOfFunctions;

public class sqrt implements MathFunction{
    @Override
    public double calculate(double arg) {
        return Math.sqrt(arg);
    }
}
