package condition;



import domain.BeanE;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class BeanAvailabilityCondition implements Condition {

	/*Örneğin burada Condition yani şart sınıfı implemente edilimiş olup
	 matches metodu ile şart sınıfı belirtilip ilgili beande bu şart sınıfı çağrılmıştır*/
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

		/*Burası tamamen bean lifecycle ile alakalıdır
		buranın eklenme sebebi şudur beanler bir lifecycle ile ayağa kalkan yapılardır
		bu sebepten ötürü önce Condition classlar ayağa kaldırılır sonra diğerleri(denildiği gibi
		burası bean lifecycle ile alakalıdır ileride göreceksin ayrıca kendinde araştır çünkü
		ileride bunun her şeyinin anlatılması mümkün değil )
		 */
		DefaultListableBeanFactory factory = (DefaultListableBeanFactory) context.getBeanFactory();
		GenericBeanDefinition beanEDefinition = new GenericBeanDefinition();
		beanEDefinition.setBeanClass(BeanE.class);
		factory.registerBeanDefinition("beanE", beanEDefinition);
		
		boolean value = context.getBeanFactory().containsBeanDefinition("beanE");
//		System.out.println(value);
		return value;
		
//		return metadata.isAnnotated("org.springframework.context.annotation.Conditional");
	}
}
