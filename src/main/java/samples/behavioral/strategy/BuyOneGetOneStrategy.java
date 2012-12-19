package samples.behavioral.strategy;

public class BuyOneGetOneStrategy implements PromoteStrategy
{
	public void buy(String product)
	{
		System.out.println("Buy one, get one free!");
	}
}
