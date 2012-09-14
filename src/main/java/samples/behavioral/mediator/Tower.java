package samples.behavioral.mediator;

import java.util.ArrayList;
import java.util.Collection;

public class Tower implements Mediator
{
	private final Collection<Plane> planes = new ArrayList<Plane>();

	public void addPlane(Plane plane)
	{
		planes.add(plane);
	}

	public void sendMessage(Colleague sender, String message)
	{
		for (Plane plane : planes)
		{
			if (plane != sender)
			{
				plane.receiveMessage(message);
			}
		}
	}
}
