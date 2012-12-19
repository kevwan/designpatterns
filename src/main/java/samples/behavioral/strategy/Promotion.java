package samples.behavioral.strategy;

public class Promotion
{
	private final PromoteStrategy strategy;

	public Promotion(PromoteStrategy strategy)
	{
		this.strategy = strategy;
	}

	public void buy(String product)
	{
		strategy.buy(product);
	}
}
