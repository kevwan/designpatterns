package samples.behavioral.chainofresponsibility;

public abstract class AbstractEmployee implements Employee
{
	private Boss boss;

	public void applyCost(int amount)
	{
		boss.approveCost(amount);
	}

	public Boss getBoss()
	{
		return boss;
	}

	public void setBoss(Boss boss)
	{
		this.boss = boss;
	}
}
