package SomeOfMainObjectTraining.SomeOfMainObjectClasses;

import SomeOfMainObjectTraining.Classes.BeanB;
import SomeOfMainObjectTraining.Classes.BeanC;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class DefaultListableBeanFactoryExample
{

    //DLBR atanır
    DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

    //DLBR'ye xml tanımlanacağı belirtilir
    XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader(factory);
    xmlReader.loadBeanDefinitions(new ClassPathResource("resources/beans.xml"));
    //Tanımlı olan xml dosyasına entegre edilmiş dlbR'den bean çekilir
    BeanB beanB = factory.getBean(BeanB.class);

        System.out.println(beanB)

		 System.out.println();

        //DLRB'ye property file tanımlanacağı belirtilir
    PropertiesBeanDefinitionReader propertiesReader = new PropertiesBeanDefinitionReader(factory);
    propertiesReader.loadBeanDefinitions(new ClassPathResource("beans.properties"));
    //Tanımlı olan property dosyasıne entegre edilmiş dlbr'den bean çekilir
    BeanC beanC = factory.getBean(BeanC.class);

		System.out.println(beanC);
}
