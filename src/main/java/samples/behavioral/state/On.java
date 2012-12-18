package samples.behavioral.state;

public class On implements State
{
	private static final State INSTANCE = new On();

	public static State instance()
	{
		return INSTANCE;
	}

	private On()
	{
	}

	public void push(Button button)
	{
		System.out.println("Turning off!");
		button.setState(Off.instance());
	}
}
