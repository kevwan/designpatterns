package samples.structural.adapter;

import samples.commons.Car;
import samples.creational.builder.Director;
import samples.creational.builder.LuxuryCarBuilder;

public class Client
{
	public static void main(String[] args)
	{
		Director director = new Director();
		director.setCarBuilder(new LuxuryCarBuilder());
		director.constructCar();
		Car car = director.getCar();
		Vehicle vehicle = new CarAdapter(car);
		vehicle.go();
	}
}
