package IdNameAndAliasTraining.ClassesOfBeans;

public class BeanAFactory implements Factory{

	@Override
	public BeanA create() {
		return new BeanA();
	}
}
