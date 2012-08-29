package samples.structural.bridge;

import samples.commons.Door;

public class DoorToPaint implements Door
{
	private final Painting painting;

	public DoorToPaint(Painting painting)
	{
		this.painting = painting;
	}

	public void close()
	{
		System.out.println("Door closed");
	}

	public void open()
	{
		System.out.println("Door opened");
	}

	public void paint()
	{
		painting.paint(this);
	}
}
