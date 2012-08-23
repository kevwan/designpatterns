package samples.creational.builder;

public class Client
{
	public static void main(String[] args)
	{
		Director director = new Director();
		director.setCarBuilder(new BasicCarBuilder());
		director.constructCar();
		director.getCar().drive();

		director.setCarBuilder(new LuxuryCarBuilder());
		director.constructCar();
		director.getCar().drive();
	}
}
