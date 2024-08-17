package addresTraining.addres;

import org.springframework.stereotype.Component;

@Component
public class IstanbulAddress extends HomeAddress {
	
	@Override
	public String getAddress() {
		return "Istanbul ama profile component olmadan";
	}
}
