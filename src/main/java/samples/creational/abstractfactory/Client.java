package samples.creational.abstractfactory;

import samples.commons.Car;
import samples.commons.Chassis;
import samples.commons.Door;

public class Client
{
	public static void main(String[] args)
	{
		createAndDriveCar("fit");
		createAndDriveCar("crv");
	}

	private static void createAndDriveCar(String seriesName)
	{
		HondaFactory factory = getFactory(seriesName);
		Chassis chassis = factory.createChassis();
		Door door = factory.createDoor();
		Car car = new Car();
		car.setChassis(chassis);
		car.setDoor(door);
		car.drive();
	}

	private static HondaFactory getFactory(String seriesName)
	{
		if ("fit".equalsIgnoreCase(seriesName))
		{
			return new FitFactory();
		}
		if ("crv".equalsIgnoreCase(seriesName))
		{
			return new CrvFactory();
		}
		throw new IllegalArgumentException(seriesName);
	}
}
