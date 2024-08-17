package addresTraining.addres;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("address")
@Profile("office")
public class OfficeAddress implements Address {

	@Override
	public String getAddress() {
		return "Istanbul";
	}
	
	@Override
	public String toString() {
		return "OfficeAddress [City=" + getAddress() + "]";
	}
}
