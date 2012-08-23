package samples.structural.decorator;

import samples.commons.Car;

public abstract class CarDecorator extends Car
{
	private final Car car;

	protected CarDecorator(Car car)
	{
		this.car = car;
	}

	@Override
	public void drive()
	{
		car.drive();
	}
}
