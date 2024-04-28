package CalculatorExample.ClassesOfFunctions;

public class Cos implements MathFunction{

	@Override
	public double calculate(double arg) {
		return Math.cos(arg);
	}
}
