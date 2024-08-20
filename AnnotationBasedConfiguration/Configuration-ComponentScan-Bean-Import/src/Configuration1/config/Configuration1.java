package Configuration1.config;


import Configuration1.Classes.BeanA;
import Configuration1.Classes.BeanB;
import Configuration1.Classes.BeanC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
/*manuel olarak yönlendirilen context componentScan ile buranın component yeri olduğunu anlıyor*/

//@ComponentScan(basePackageClasses={Configuration1.config.Configuration1.java}//birden fazla componentscan classı alır
//@ComponentScan(basePackages={"Configuration1.config"})    //birden fazla componentscan paketi alır
@ComponentScan     //bulunduğu paketteki sınıfları scan eder
public class Configuration1 {
	
	public Configuration1() {
		System.out.println("==> Configuration1()");
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
