package Configuration2.config;


import Configuration2.classes.BeanA;
import Configuration2.classes.BeanB;
import Configuration2.classes.BeanC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*ComponentScan özelliği beanste olduğu için beande buranın paketini component
* scan edeceği için buraya configurasyon olduğunu bildiriyoruz*/
@Configuration
public class Configuration2 {

    public Configuration2() {
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
