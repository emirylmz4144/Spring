package DatabaseTraining.UsingProfileClasses;

import DatabaseTraining.custom.MySQL;
import DatabaseTraining.custom.PostgreSQL;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//Burada iki profilide almalı diyor
@Component
@Profile("MySQL & PostgreSQL")
public class BeanD {

	@Override
	public String toString() {
		return "BeanD []";
	}
}
