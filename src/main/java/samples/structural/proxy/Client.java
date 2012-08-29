package samples.structural.proxy;

import samples.commons.Car;
import samples.creational.builder.BasicCarBuilder;
import samples.creational.builder.Director;

public class Client
{
	public static void main(String[] args)
	{
		Director director = new Director();
		director.setCarBuilder(new BasicCarBuilder());
		director.constructCar();
		Car car = director.getCar();
		CarWithKeylessEntrySystem keylessCar = new CarWithKeylessEntrySystem(car);
		keylessCar.setKeyDetector(new KeyDetector()
		{
			public boolean isKeyDetected()
			{
				return true;
			}
		});
		keylessCar.open();
		keylessCar.setKeyDetector(new KeyDetector()
		{
			public boolean isKeyDetected()
			{
				return false;
			}
		});
		keylessCar.open();
	}
}
