package samples.behavioral.strategy;

public class DiscountStrategy implements PromoteStrategy
{
	public void buy(String product)
	{
		System.out.println("You got 50% off discount!");
	}
}
