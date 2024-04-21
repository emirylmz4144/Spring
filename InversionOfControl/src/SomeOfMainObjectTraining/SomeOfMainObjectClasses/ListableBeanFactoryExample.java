package SomeOfMainObjectTraining.SomeOfMainObjectClasses;

import java.util.Arrays;
import java.util.Map;

import SomeOfMainObjectTraining.Classes.BeanA;
import SomeOfMainObjectTraining.Classes.BeanB;
import SomeOfMainObjectTraining.Classes.BeanC;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * BeanFactory'den farkı daha rahat yönetim,daha fazla erişim , ve tek bean'e değilde tüm beanlere hakim olmaktır
 * Zaten adı bu yüzden Listable ile başlar
 */

public class ListableBeanFactoryExample {

	public static void main(String[] args) {


		ListableBeanFactory beanFactory = getListableBeanFactory();

		//Belirtilen yerde kaç adet bean olduğunun sayısı
		int beanCount = beanFactory.getBeanDefinitionCount();
		System.out.println("Bean count: " + beanCount);


		//Tanımlı olan tümBeanlerin isimlerini getirir
		String[] beanNames = beanFactory.getBeanDefinitionNames();
		System.out.println("\nBean definition names:");
		Arrays.stream(beanNames).forEach(System.out::println);

		//İlgili türdeki tanımlı olan tüm beanleri getirir
		String[] beanNamesForBeanA = beanFactory.getBeanNamesForType(BeanA.class);
		System.out.println("\nBean definition names for type BeanA:");
		Arrays.stream(beanNamesForBeanA ).forEach(System.out::println);

		//İlgili türdeki bean'in içine girerek haritalandırma yapar ve tüm detaylarını bu haritalandırma üzerinden getirir
		Map<String, BeanA> beansForBeanA = beanFactory.getBeansOfType(BeanA.class);
		System.out.println("\nBeans for type BeanA:");
		beansForBeanA.forEach((k, v) -> System.out.println("Name: " + k + " Bean: " + v));
	}

	/**
	 * BeanFactory'nin tüm işlevlerini yapabileceğine dair kanıt niteliğinde bir method
	 * @param beanFactory
	 */
	public void callBeanFactoryMethods(ListableBeanFactory beanFactory) {
		
		BeanA beanA = (BeanA) beanFactory.getBean("beanA");
		System.out.println(beanA);
		
		beanA = (BeanA) beanFactory.getBean("bean_A");
		System.out.println(beanA);
		
		beanA = (BeanA) beanFactory.getBean("bean_a");
		System.out.println(beanA);
		
		beanA = (BeanA) beanFactory.getBean("BEAN_A");
		System.out.println(beanA);
		
		beanA = beanFactory.getBean(BeanA.class);
		System.out.println(beanA);
		
		System.out.println();
		
		BeanB beanB = (BeanB) beanFactory.getBean("beanB");
		System.out.println(beanB);
		
		beanB = beanFactory.getBean(BeanB.class);
		System.out.println(beanB);
		
		BeanC beanC = (BeanC) beanFactory.getBean("beanC");
		System.out.println(beanC);
		
		beanC = beanFactory.getBean(BeanC.class);
		System.out.println(beanC);
		
		System.out.println();
		
		boolean b = beanFactory.containsBean("beanA");
		System.out.println(b);
		
		b = beanFactory.containsBean("a");
		System.out.println(b);
		
		beanA = (BeanA) beanFactory.getBean("a");
		System.out.println(beanA);
		
		System.out.println("\nAliases");
		String[] aliases = beanFactory.getAliases("beanA");
		for(String alias : aliases)
			System.out.println(alias);
		
		System.out.println();
		
		ObjectProvider<BeanA> op = beanFactory.getBeanProvider(BeanA.class);
		System.out.println(op);
	}
	
	private static ListableBeanFactory getListableBeanFactory() {
		ListableBeanFactory beanFactory = new ClassPathXmlApplicationContext("SomeOfMainObjectTraining/resources/beans.xml");
		return beanFactory;
	}
}
