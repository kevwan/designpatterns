package samples.behavioral.chainofresponsibility;

public interface Boss extends Employee
{
	boolean approveCost(int amount);
}
