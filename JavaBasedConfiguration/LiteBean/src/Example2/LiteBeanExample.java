package Example2;

import Example2.classes.BeanB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = BeanB.class)
public class LiteBeanExample {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(LiteBeanExample.class);
		BeanB beanB=context.getBean(BeanB.class);
		System.out.println(beanB);
	}

}
