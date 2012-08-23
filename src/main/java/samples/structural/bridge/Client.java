package samples.structural.bridge;

public class Client
{
	public static void main(String[] args)
	{
		DoorToPaint basicDoor = new DoorToPaint(new BasicPainting());
		basicDoor.paint();

		DoorToPaint colorfulDoor = new DoorToPaint(new ColorfulPainting());
		colorfulDoor.paint();
	}
}
