package samples.structural.proxy;

import samples.commons.CarDef;

public class CarWithKeylessEntrySystem implements CarDef
{
	private final CarDef car;
	private KeyDetector detector;

	public CarWithKeylessEntrySystem(CarDef car)
	{
		this.car = car;
	}

	public void drive()
	{
		car.drive();
	}

	public void open()
	{
		if (isKeyDetected())
		{
			car.open();
		}
		else
		{
			System.out.println("No key detected, reject to open the car!");
		}
	}

	public void setKeyDetector(KeyDetector detector)
	{
		this.detector = detector;
	}

	private boolean isKeyDetected()
	{
		return detector.isKeyDetected();
	}
}
