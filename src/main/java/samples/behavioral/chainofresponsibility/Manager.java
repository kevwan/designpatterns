package samples.behavioral.chainofresponsibility;

public class Manager extends AbstractBoss
{
	private static final String LEVEL = "manager";

	@Override
	public boolean approveCost(int amount)
	{
		if (amount > 10000)
		{
			return super.approveCost(amount);
		}
		System.out.println("Approved by " + LEVEL);
		return true;
	}
}
