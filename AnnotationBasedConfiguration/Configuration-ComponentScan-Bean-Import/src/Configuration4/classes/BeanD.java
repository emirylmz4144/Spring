package Configuration4.classes;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanD {
	private String string1;
	private String string2;
	private int int1;
	private int int2;
	
	@Autowired
	public BeanD(String string1, String string2, int int1, int int2) {
		this.string1 = string1;
		this.string2 = string2;
		this.int1 = int1;
		this.int2 = int2;
	}

	@Override
	public String toString() {
		return "BeanD [string1=" + string1 + ", string2=" + string2 + ", int1=" + int1 + ", int2=" + int2 + "]";
	}
}
