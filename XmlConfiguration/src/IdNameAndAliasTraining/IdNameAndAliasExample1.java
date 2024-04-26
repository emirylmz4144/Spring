package IdNameAndAliasTraining;


import IdNameAndAliasTraining.ClassesOfBeans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IdNameAndAliasExample1 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "IdNameAndAliasTraining/resources/idBeans.xml");
        callIdExamples(context);
        callNameExamples(context);
        callAliasExamples(context);
        getBeanWithoutIdAndName(context);
    }

    /**
     * Id ile bean çağırma fonksiyonu
     * @param context
     * */
    public static void callIdExamples(ApplicationContext context) {
        System.out.println("\n==> callIdExamples");
        BeanA beanA = (BeanA) context.getBean("beanA1");
        System.out.println(beanA);

        Object objectBeanA = context.getBean("beanA1");
        System.out.println(objectBeanA);
    }

    /**
     * Name ile beans kontrol fonksiyonu
     * @param context
     */
    public static void callNameExamples(ApplicationContext context) {
        System.out.println("\n==> callNameExamples()");
        BeanA beanA = (BeanA) context.getBean("aBean");
        System.out.println(beanA);

        BeanB beanB = (BeanB) context.getBean("bBean");
        System.out.println(beanB);

        BeanC beanC = (BeanC) context.getBean("cBean");
        System.out.println(beanC);
    }

    /**
     * Herhangi bir şekilde Id veya Name almamış bean getirme fonksiyonu
     * @param context
     */

    /**
     * Aliaslara göre bean getirme fonksiyonu
     * @param context
     */
    private static void callAliasExamples(ApplicationContext context) {
        System.out.println("\n==> callAliasExamples");

        System.out.println("\nAliases of beanA1");
        String[] aliases = context.getAliases("beanA1");
        for (String alias : aliases) {
            BeanA beanA = (BeanA) context.getBean(alias);
            System.out.println(alias + ":" + beanA);
        }

        System.out.println("\nAliases of aaBean");
        aliases = context.getAliases("aaBean");
        for (String alias : aliases) {
            BeanA beanA = (BeanA) context.getBean(alias);
            System.out.println(alias + ":" + beanA);
        }
    }
    private static void getBeanWithoutIdAndName(ApplicationContext context) {
        System.out.println("\n==> getBeanWithoutIdAndName()");
        //DefaultListableBeanFactory ile name veya id almamış beanleri type'a göre getirir
        BeanA beanA = (BeanA) context.getBean(BeanA.class);
        System.out.println(beanA);
    }

}
