package Example3.classes;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanF {

    private String nameOfBean;

    //Bu class beanD'de bean olarak üretilecek ve orada ilgili attributelar olduğu için
    //Burada inject edilmiyor gibi görünsede asıl bean olarak gönderildiği yerde
    //injection işlemi yapılacaktır.
    @Autowired
    public void setNameOfBean(String nameOfBean) {
        this.nameOfBean = nameOfBean;
    }

    @Override
    public String toString() {
        return "BeanF [nameOfBean=" + nameOfBean + "]";
    }
}
