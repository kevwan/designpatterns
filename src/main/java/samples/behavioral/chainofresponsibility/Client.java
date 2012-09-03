package samples.behavioral.chainofresponsibility;

public class Client
{
	public static void main(String[] args)
	{
		Employee engineer = new Engineer();
		Boss leader = new Leader();
		Boss manager = new Manager();
		Boss director = new Director();
		engineer.setBoss(leader);
		leader.setBoss(manager);
		manager.setBoss(director);

		engineer.applyCost(500);
		engineer.applyCost(5000);
		engineer.applyCost(50000);
		engineer.applyCost(500000);
	}
}
