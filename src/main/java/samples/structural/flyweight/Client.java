package samples.structural.flyweight;

public class Client
{
	public static void main(String[] args)
	{
		CheckerFactory factory = new CheckerFactory();
		CarOnSale car1 = new CarOnSale(factory.getChecker("1"));
		CarOnSale car2 = new CarOnSale(factory.getChecker("2"));
		car1.print();
		car2.print();
	}
}
