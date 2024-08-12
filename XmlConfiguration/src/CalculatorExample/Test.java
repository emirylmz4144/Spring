package CalculatorExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		// Create a beans.xml file and fix this path.
		ApplicationContext context = new ClassPathXmlApplicationContext("CalculatorExample/resources/beans.xml");
		Calculator calculator = (Calculator) context.getBean("calculator");
		
		System.out.println(calculator.doCalculation("sin", 2*Math.PI*30/360));
		System.out.println(calculator.doCalculation("cos", 2*Math.PI*30/360));
		System.out.println(calculator.doCalculation("log", 2.71828));
		System.out.println(calculator.doCalculation("sqrt",100));


	}
}
