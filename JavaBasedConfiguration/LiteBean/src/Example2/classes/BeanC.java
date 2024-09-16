package Example2.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class BeanC {
	private String nameOfBean;

	//BeanB'de beanC bir bean olarak üretiliyor ve orada nameOfBean adında bir bean var
	//bu class oraya bean olarak gönderildiği için bu değişken orada inject ediliyor
	@Autowired
	public void setNameOfBean(String nameOfBean) {
		this.nameOfBean = nameOfBean;
	}

	@Override
	public String toString() {
		return "BeanC [nameOfBean=" + nameOfBean + "]";
	}
}
