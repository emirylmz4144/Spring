package DatabaseTraining.UsingProfileClasses;

import DatabaseTraining.custom.MySQL;
import DatabaseTraining.custom.PostgreSQL;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//Burada iki profilden biri olur diyor
@Component
@Profile("MySQL | PostgreSQL")
public class BeanC {

	@Override
	public String toString() {
		return "BeanC []";
	}
}
