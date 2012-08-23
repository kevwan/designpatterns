package samples.structural.bridge;

import samples.commons.Door;

public class BasicPainting implements Painting
{
	public void paint(Door door)
	{
		System.out.println("Painting door with basic color");
	}
}
