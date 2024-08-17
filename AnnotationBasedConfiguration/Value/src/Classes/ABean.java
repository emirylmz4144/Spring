package Classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("aBean")
public class ABean {
	
	private int i;
	private double pi;
	
	public ABean(@Value("${z}") int zValue, @Value("${p}") double xValue) {
		i = zValue * 10;
		pi = xValue;
	}

	public int getI() {
		return i;
	}
	
	public double getPi() {
		return pi;
	}

	@Override
	public String toString() {
		return "ABean [i=" + i + ", pi=" + pi + "]";
	}
}
