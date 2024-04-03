package ExampleOf_Depend_DependInject.step06_FrameworkOfFactories;

import java.util.Properties;

/**
 * Bu sınıf Spring Frameworkü temsil etmekte olup
 * amacı kendisine gönderilecek olan yani istenecek olan
 * sınıflardan instance oluşturup o sınıflara bağımlı olmadan
 * sadace gerektiğini anladığımızda o sınıftan instance oluşturup
 * bize gönderme işlemini gerçekleştirmesidir.
 */
public class ObjectProviderFramework {
	
	public ObjectProviderFramework(){}

	public Object getObject(String className) {
		Object o=null;
		try {
			o = Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			System.out.println("Can not instantiate the class: " + className);
		} catch (IllegalAccessException e) {
			System.out.println("Illegal access to the class: " + className);
		} catch (ClassNotFoundException e) {
			System.out.println("No such class found: " + className);
		}
		
		return o;
	}
}
