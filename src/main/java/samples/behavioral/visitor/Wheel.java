package samples.behavioral.visitor;

public class Wheel implements CarElement
{
	private final String name;

	public Wheel(String name)
	{
		this.name = name;
	}

	public void accept(CarElementVisitor visitor)
	{
		visitor.visit(this);
	}

	public String getName()
	{
		return name;
	}
}
