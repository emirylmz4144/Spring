package calculator.qualifier.function;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cos")
//@Component
//@Qualifier("cos")
public class Cos implements MathFunction{

	@Override
	public double calculate(double arg) {
		return Math.cos(arg);
	}
	
	@Override
	public String getName() {
		return "cos";
	}

}
