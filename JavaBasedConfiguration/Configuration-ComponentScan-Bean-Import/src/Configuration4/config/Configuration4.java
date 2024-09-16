package Configuration4.config;


import Configuration4.classes.BeanA;
import Configuration4.classes.BeanB;
import Configuration4.classes.BeanC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Configuration4 {
	
	public Configuration4() {
		System.out.println("==> Configuration4()");
	}

	@Bean
	public BeanA getBeanA() {
		return new BeanA();
	}
	
	@Bean
	public BeanB getBeanB(String name, int age) {
		return new BeanB(name, age);
	}
	
	@Bean
	public BeanC getBeanC() {
		return new BeanC();
	}
	
	@Bean
	public String name() {
		return "Emir";
	}
	
	@Bean
	public int age() {
		return 22;
	}
	
	@Bean
	public String nameOfBean() {
		return "BEAN-C";
	}
}
