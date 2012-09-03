package samples.behavioral.chainofresponsibility;

public class Director extends AbstractBoss
{
	private static final String LEVEL = "director";

	@Override
	public boolean approveCost(int amount)
	{
		if (amount > 100000)
		{
			return super.approveCost(amount);
		}
		System.out.println("Approved by " + LEVEL);
		return true;
	}
}
