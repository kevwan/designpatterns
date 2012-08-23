package samples.structural.bridge;

import samples.commons.Door;

public class ColorfulPainting implements Painting
{
	public void paint(Door door)
	{
		System.out.println("Painting door with more colors");
	}
}
