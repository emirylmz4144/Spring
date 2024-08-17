package calculator.qualifier.function;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("log")
//@Component
//@Qualifier("log")
public class Log implements MathFunction{

	@Override
	public double calculate(double arg) {
		return Math.log(arg);
	}

	@Override
	public String getName() {
		return "log";
	}
}
