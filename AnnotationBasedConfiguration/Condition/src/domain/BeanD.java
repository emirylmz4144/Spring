package domain;


import condition.BeanAvailabilityCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(BeanAvailabilityCondition.class)
public class BeanD {

	private BeanC beanC;
	private BeanE beanE;

	@Autowired
	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}
	
	@Autowired
	public void setBeanE(BeanE beanE) {
		this.beanE = beanE;
	}

	@Override
	public String toString() {
		return "BeanD [beanC=" + beanC + ", beanE=" + beanE + "]";
	}
}
