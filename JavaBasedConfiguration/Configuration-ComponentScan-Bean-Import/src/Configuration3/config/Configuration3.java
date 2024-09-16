package Configuration3.config;


import Configuration3.classses.BeanA;
import Configuration3.classses.BeanB;
import Configuration3.classses.BeanC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Configuration3 {
	
	public Configuration3() {
		System.out.println("==> Configuration3()");
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
