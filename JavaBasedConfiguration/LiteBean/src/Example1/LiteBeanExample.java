package Example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = BeanA.class)
public class LiteBeanExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(LiteBeanExample.class);
        BeanA beanA=(BeanA) context.getBean("beanA");
        System.out.println(beanA.toString());
    }
}
