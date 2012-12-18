package samples.behavioral.state;

public class Off implements State
{
	private static final State INSTANCE = new Off();

	public static State instance()
	{
		return INSTANCE;
	}

	private Off()
	{
	}

	public void push(Button button)
	{
		System.out.println("Turning on!");
		button.setState(On.instance());
	}
}
