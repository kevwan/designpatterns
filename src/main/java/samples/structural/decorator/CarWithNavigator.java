package samples.structural.decorator;

import samples.commons.Car;

public class CarWithNavigator extends CarDecorator
{
	public CarWithNavigator(Car car)
	{
		super(car);
	}

	@Override
	public void drive()
	{
		// add more responsibilities here
		System.out.println("Navigator has been activated");
		super.drive();
	}
}
