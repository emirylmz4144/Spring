package domain;

import condition.OSCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/*Conditional şart eklemek için kullanılır
Peki ya profile'dan farkı nedir diye soracak olursak eğer
profile genelde birden çok bean oluşturmada profile bakarken conditional şart koşmak için
kullanılır ve genelde bir tane classa uygun şart sağlanırsa uygulanır
zaten condition paketine bakacak olursan hep bir şart metodu çağrılıyor ve biz böylece
istediğimiz şartı sağlayan classa uygun olanı seçiyoruz spring'in if else yapısı gibi düşünülebilir
 */
@Component
@Conditional(OSCondition.class)
public class BeanA {
	
	private BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}

	@Autowired
	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
	
	@Override
	public String toString() {
		if(beanB != null)
			return "BeanA: " + beanB.toString();
		else
			return "BeanA: " + "beanB is null";
	}
	
	public static BeanA create() {
		return new BeanA();
	}
}
