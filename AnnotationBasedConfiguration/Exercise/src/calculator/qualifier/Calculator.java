package calculator.qualifier;


import calculator.qualifier.function.MathFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Calculator implements CalculatorI{

	@Autowired
	//@Qualifier("sin")
	MathFunction sin;

	@Override
	public double doCalculation(double argument)
	{
		return sin.calculate(argument);
	}

	/*
	* public double doCalculation(String functionName, double argument){
		MathFunction function = null;
		if(sin.getName().equals(functionName))
				function = sin;
		else if(cos.getName().equals(functionName))
			function = cos;
		else if(log.getName().equals(functionName))
			function = log;

		return function.calculate(argument);
	}

	*/
}
