package DatabaseTraining.UsingProfileClasses;

import DatabaseTraining.custom.MySQL;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("MySQL")
//@MySQL
public class BeanA {

	@Override
	public String toString() {
		return "BeanA []";
	}
}
