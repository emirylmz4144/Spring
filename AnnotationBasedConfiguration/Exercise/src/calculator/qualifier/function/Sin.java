package calculator.qualifier.function;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sin")
//@Component
//@Qualifier("sin")
public class Sin implements MathFunction{

	@Override
	public double calculate(double arg) {
		return Math.sin(arg);
	}

	@Override
	public String getName() {
		return "sin";
	}
}
