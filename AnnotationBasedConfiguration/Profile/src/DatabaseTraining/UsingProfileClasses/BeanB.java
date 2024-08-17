package DatabaseTraining.UsingProfileClasses;

import DatabaseTraining.custom.PostgreSQL;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("PostgreSQL")
//@PostgreSQL
public class BeanB {
	@Override
	public String toString() {
		return "BeanB []";
	}
}
