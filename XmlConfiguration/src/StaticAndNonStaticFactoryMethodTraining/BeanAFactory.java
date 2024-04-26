package StaticAndNonStaticFactoryMethodTraining;

import StaticAndNonStaticFactoryMethodTraining.ClassesOfBeans.BeanA;

public class BeanAFactory implements Factory{

	@Override
	public BeanA create() {
		return new BeanA();
	}
}
