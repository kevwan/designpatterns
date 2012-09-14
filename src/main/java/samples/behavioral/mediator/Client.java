package samples.behavioral.mediator;

public class Client
{
	public static void main(String[] args)
	{
		Tower tower = new Tower();
		Plane plane1 = new Plane(tower);
		Plane plane2 = new Plane(tower);
		Plane plane3 = new Plane(tower);
		tower.addPlane(plane1);
		tower.addPlane(plane2);
		tower.addPlane(plane3);
		plane1.sendMessage("plane1 is landing");
		plane2.sendMessage("plane2 is departing");
		plane3.sendMessage("plane3 is waiting");
	}
}
