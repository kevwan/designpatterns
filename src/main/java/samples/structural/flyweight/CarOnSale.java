package samples.structural.flyweight;

import samples.commons.Car;

public class CarOnSale extends Car
{
	private final Checker checker;

	public CarOnSale(Checker checker)
	{
		this.checker = checker;
	}

	public Checker getChecker()
	{
		return checker;
	}

	public void print()
	{
		System.out.println("Car on sale, checked by " + checker.getName());
	}
}
