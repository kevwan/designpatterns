package samples.behavioral.chainofresponsibility;

public class Leader extends AbstractBoss
{
	private static final String LEVEL = "leader";

	@Override
	public boolean approveCost(int amount)
	{
		if (amount > 1000)
		{
			return super.approveCost(amount);
		}
		System.out.println("Approved by " + LEVEL);
		return true;
	}
}
