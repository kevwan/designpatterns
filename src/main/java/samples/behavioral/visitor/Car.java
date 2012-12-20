package samples.behavioral.visitor;

public class Car implements CarElement
{
	private final CarElement[] elements;

	public Car()
	{
		elements = new CarElement[] {
			new Wheel("front left"),
            new Wheel("front right"),
            new Wheel("back left"),
            new Wheel("back right"),
            new Body(),
            new Engine()
		};
	}

	public void accept(CarElementVisitor visitor)
	{
		for (CarElement element : elements)
		{
			element.accept(visitor);
		}
		visitor.visit(this);
	}
}
