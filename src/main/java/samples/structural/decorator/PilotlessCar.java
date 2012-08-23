package samples.structural.decorator;

import samples.commons.Car;

public class PilotlessCar extends CarDecorator
{
	protected PilotlessCar(Car car)
	{
		super(car);
	}

	@Override
	public void drive()
	{
		// add more responsibilities here
		System.out.println("Pilotless mode has been activated");
		super.drive();
	}
}
