package Example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/*Dikkat edilmesi gereken nokta şudur bu class liteBeanleri alır yani kendi içineki beanleri almakla mükelleftir
* ve ayrıca içindeki liteBean factory metotlar statictir çünkü static olmasaydı bu sınıfın consturcturuna
* inject edilmesi gereken beanler yine kendi içinde olduğu için ve spring bu classı oluştururken
* ilgili beanleri çağıramadığı için hata fırlatır bu yüzden bu class kendi kendine bağımlı olduğundan
* hata alırız*/
@Component("beanA")
public class BeanA {
    private String name;
    private int count;
    private boolean open;

    @Autowired
    public BeanA(String name, int count, boolean open) {
        this.name = name;
        this.count = count;
        this.open = open;
    }

    @Bean
    public static String name() {
        return "Bean-A";
    }

    @Bean
    public static int count() {
        return 5;
    }

    @Bean
    public static boolean open() {
        double d = Math.random();
        if (d > 0.5)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "BeanA [name=" + name + ", count=" + count + ", open=" + open + "]";
    }
}

