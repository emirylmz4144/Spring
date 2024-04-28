package LazyAndEagerInitilationTraining.Classes;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanD {
	private String name;
	
	@Autowired
	public BeanD(String name) {
		System.err.println("in BeanD()");
		this.name = name;
	}

	@Override
	public String toString() {
		return "BeanD [name=" + name + "]";
	}
}
