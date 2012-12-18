package samples.behavioral.state;

public class Button
{
	private State state;

	public Button()
	{
		state = Off.instance();
	}

	public void push()
	{
		state.push(this);
	}

	public void setState(State state)
	{
		this.state = state;
	}
}
