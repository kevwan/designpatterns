package samples.behavioral.chainofresponsibility;

public abstract class AbstractBoss extends AbstractEmployee implements Boss
{
	public boolean approveCost(int amount)
	{
		Boss boss = getBoss();
		if (boss != null)
		{
			return boss.approveCost(amount);
		}
		System.out.println("Too much cost, declined!");
		return false;
	}
}
