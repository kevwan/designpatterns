package samples.behavioral.mediator;

public abstract class Colleague
{
	private final Mediator mediator;

	public Colleague(Mediator mediator)
	{
		this.mediator = mediator;
	}

	public void receiveMessage(String message)
	{
		System.out.println(this + " received message " + message);
	}

	public void sendMessage(String message)
	{
		mediator.sendMessage(this, message);
	}
}
