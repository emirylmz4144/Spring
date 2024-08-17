package addresTraining.addres;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("address")
@Profile("home")
public class AyvalikAddress extends HomeAddress {
	
	@Override
	public String getAddress() {
		return "Ayvalik";
	}
}
