package CalculatorExample;

import java.util.Map;

import CalculatorExample.ClassesOfFunctions.MathFunction;

public class Calculator  implements ICalculator{
	private Map<String, MathFunction> functions;

	public Calculator() {

	}
	
	public void setFunctions(Map<String, MathFunction> functions) {
		this.functions = functions;
	}

	@Override
	public double doCalculation(String functionName, double argument){
		MathFunction function = functions.get(functionName);
		return function.calculate(argument);
	}

}
