package samples.structural.facade;

public class Client
{
	public static void main(String[] args)
	{
		CarFacade facade = CarFacade.get();
		facade.start();
		facade.stop();
	}
}
