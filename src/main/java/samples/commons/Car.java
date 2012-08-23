package samples.commons;


public class Car
{
	private Chassis chassis;
	private Door door;

	public void drive()
	{
		door.close();
		chassis.move();
	}

	public void setChassis(Chassis chassis)
	{
		this.chassis = chassis;
	}

	public void setDoor(Door door)
	{
		this.door = door;
	}
}
