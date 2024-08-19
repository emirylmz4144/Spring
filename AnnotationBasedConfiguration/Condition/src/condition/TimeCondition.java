package condition;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class TimeCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		LocalDate date = LocalDate.now();
		int day = date.get(ChronoField.DAY_OF_WEEK);
//		day = 6;
		boolean value = switch (day) {
			case 1, 2, 3, 4, 5 -> true;
			case 6, 7 -> false;
			default -> false;
		};
		return value;
	}
}
