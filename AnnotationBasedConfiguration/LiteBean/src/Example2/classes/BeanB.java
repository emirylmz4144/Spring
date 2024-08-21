package Example2.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
	private String name;
	private int age;
	private BeanC beanC;

	@Autowired
	public BeanB(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//Aşağıda oluşturulan beanC autowire ile inject ediliyor
	@Autowired
	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}

	//Burada beanC manuel oluşturulduğu için beanC de @component yazmayayabiliyoruz
	@Bean
	private BeanC beanC() {
		BeanC beanC = new BeanC();
		return beanC;
	}
	
	@Bean
	private static String name() {
		return "Zeynep";
	}
	
	@Bean
	private static int age() {
		return 5;
	}
	
	@Bean

	private static String nameOfBean() {
		return "Bean-C";
	}
	
	@Override
	public String toString() {
		return "BeanB [name=" + name + ", age=" + age + ", beanC=" + beanC + "]";
	}
}
