package StaticAndNonStaticFactoryMethodTraining;

import StaticAndNonStaticFactoryMethodTraining.ClassesOfBeans.BeanA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class FactoryExample {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("StaticAndNonStaticFactoryMethodTraining/resources/beans.xml");
		
		useStaticFactoryMethod(context);
		useFactoryMethod(context);
	}

	/**
	 * StaticFactoryMethod sayesinde constructor bazlı(xml içerisinde birbiri içerisine geçmiş ve karmaşık görünen) tanımlamalar
	 * yerine dependency yapılarını birazda olsa metotlarda yapıp bu metotlarada konfigurasyon dosyalarında
	 * kafamızı karıştırmayarak bean'in direkt olarak ne yaptığını anlatan isim verip bunu da konfigurasyon dosyamızda
	 * belirtirsek böylece daha kolay bir şekilde yönetim sağlarız
	 * @param context
	 */
	public static void useStaticFactoryMethod(ApplicationContext context) {
		BeanA beanA = (BeanA) context.getBean("beanAThroughStaticFactory");
		System.out.println("beanA2ThroughStaticFactory: " + beanA);
	}

	/**
	 * Bu yöntem ile de yukarıdaki işlemi intance bazlı yaparak yönetimi daha sıkı yapmış oluruz
	 * @param context
	 */
	public static void useFactoryMethod(ApplicationContext context) {
		BeanA beanA = (BeanA) context.getBean("beanAThroughFactory");
		System.out.println("beanA2ThroughFactory: " + beanA);
	}
}
