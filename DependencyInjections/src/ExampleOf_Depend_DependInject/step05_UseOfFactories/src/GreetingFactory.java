import java.io.FileInputStream;
import java.util.Properties;

public class GreetingFactory implements Factory{
	private static GreetingFactory instance;
	private Properties props;

	private GreetingRenderer renderer;
	private GreetingProvider provider;

	{
		props = new Properties();
		try {
			props.load(new FileInputStream("src/resources/application.properties"));
			// Get the name of the implementation classes


			String rendererClass = props.getProperty("renderer.class");
			String providerClass = props.getProperty("provider.class");
			// Create object instances of MessageRenderer and MessageProvider
			renderer = (GreetingRenderer) Class.forName(rendererClass).newInstance();
			provider = (GreetingProvider) Class.forName(providerClass).newInstance();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	static {
		instance = new GreetingFactory();
	}

	public static GreetingFactory getInstance() {
		return instance;
	}

	@Override
	public GreetingRenderer getGreetingRenderer() {
		return renderer;
	}

	@Override
	public GreetingProvider getGreetingProvider() {
		return provider;
	}
}
