package samples.creational.abstractfactory;

public class Client
{
	private static class Car
	{
		private final Chassis chassis;
		private final Door door;

		public Car(Chassis chassis, Door door)
		{
			this.chassis = chassis;
			this.door = door;
		}

		public void drive()
		{
			door.close();
			chassis.move();
		}
	}

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
		new Car(chassis, door).drive();
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
