package samples.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CheckerFactory
{
	private final Map<String, Checker> checkers = new HashMap<String, Checker>();

	public CheckerFactory()
	{
		checkers.put("1", new Checker("kevin", 34));
		checkers.put("2", new Checker("david", 39));
		checkers.put("3", new Checker("elli", 30));
		checkers.put("4", new Checker("simon", 40));
	}

	public Checker getChecker(String id)
	{
		return checkers.get(id);
	}
}
