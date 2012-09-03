package samples.behavioral.chainofresponsibility;

public interface Employee
{
	void applyCost(int amount);
	Boss getBoss();
	void setBoss(Boss boss);
}
