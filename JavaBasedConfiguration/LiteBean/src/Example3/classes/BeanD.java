package Example3.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
/*Burada metotlar static değil çünkü hem bağlama işlemini hemde oluşturma işlemini kendi içinde yapmış olup
* işlemleri gerçekleştirmiştir fakat bunu yapabilmesi consturctor olmamasıdır eğer ki consturctor yapacak olursak
* (default consturctor dışında) yine hata verecek çünkü kendi içinde ilgili beanleri oluşturmamıştır.*/
@Component("beanD")
public class BeanD {
    @Autowired
    private String name;

    @Autowired
    private int count;

    @Autowired
    private boolean open;

    private BeanE beanE;
    private BeanF beanF;


    @Autowired
    private void setBeanE(BeanE beanE){
        this.beanE=beanE;
    }

    @Autowired
    public void setBeanF(BeanF beanF){
        this.beanF=beanF;
    }
    @Bean
    private BeanF beanF(){
        BeanF beanF=new BeanF();
        return beanF;
    }

    @Bean
    private BeanE beanE(String beanName,int number){
        BeanE beanE=new BeanE(beanName,number);
        return beanE;
    }

    @Bean
    private String name(){
        return "Emir";
    }
    @Bean
    private int count(){
        return (int) Math.random();
    }

    @Bean
    private boolean open(){
        double d = Math.random();
        if (d > 0.5)
            return true;
        else
            return false;
    }





    @Bean
    public String beanName() {
        return "Bean-E";
    }

    @Bean
    public int number() {
        return 111;
    }

    //BeanF de bu metotlar aynı isimde bir değişken olduğu için injection işlemi eşleşecektir.
    @Bean
    public String nameOfBean() {
        return "Bean-F";
    }

    @Override
    public String toString() {
        return "BeanD [name=" + name + ", count=" + count + ", open=" + open + ", beanE=" + beanE + ", beanF=" + beanF + "]";
    }
}
