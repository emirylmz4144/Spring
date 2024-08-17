package Classes;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


/*Xmlde property dosyası tanımlanabileceği gibi bir beanleştirilecek componenttada bu dosyalar
aşağıdaki gibi bildirilebilir

1-@PropertySource("classpath:org/javaturk/spring/di/ch06/value/resources/app.properties")

2-@PropertySources({
  @PropertySource("classpath:org/javaturk/spring/di/ch06/value/resources/app.properties"),
    @PropertySource("classpath:org/javaturk/spring/di/ch06/value/resources/bean.properties")
})
 */



@Component
@PropertySource("classpath:resources/bean.properties")
public class ValueBean {
	
	@Value("${intValue}") // Or @Value("5")
	private int i;
	
	@Value("${intValue}")
	private int j;
	
	// A property with default value
	@Value("${noSuchParam:555}")
	private int k;
	
	@Value(value = "#{systemProperties['java.version']}")
	private String javaVersion;
	
	@Value(value = "#{systemProperties['os.name']}")
	private String osName;
	
	@Value("#{systemProperties}")
	private Map<String, String> systemProperties;
	
	@Value("#{aBean.pi}")
	private double pi;
	
	@Value("#{aBean.i}")
	private int anInt;

	@Value("${name}")
	private String name;
	
	private String statement;
	
	private String anotherStatement;
	
	private String yetAnotherStatement;

	public ValueBean(@Value("${sentence1}")  String statement) {
		this.statement = statement;
	}

	@Autowired
	public void setAnotherStatement(@Value("${sentence2}")  String statement) {
		this.anotherStatement = statement;
	}
	
	@Autowired
	public void f(@Value("${sentence3}")  String statement) {
		this.yetAnotherStatement = statement;
	}

	public Map<String, String> getSystemProperties() {
		return systemProperties;
	}

	@Override
	public String toString() {
		return "ValueBean [i=" + i + ", j=" + j + ", k=" + k + ", javaVersion=" + javaVersion + ", osName=" + osName + ", pi=" + pi + ", anInt="
				+ anInt + ", name=" + name + ", statement=" + statement + ", anotherStatement=" + anotherStatement + ", yetAnotherStatement="
				+ yetAnotherStatement + "]";
	}

}
