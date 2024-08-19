package condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class JavaVersionCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String javaVersion = context.getEnvironment().getProperty("java.version");
		if (javaVersion.equals("14"))
			return true;
		else
			return false;
	}
}
