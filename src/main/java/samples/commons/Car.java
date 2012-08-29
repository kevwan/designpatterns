package samples.commons;

public class Car implements CarDef
{
	private Chassis chassis;
	private Door door;

	public void drive()
	{
		door.close();
		chassis.move();
	}

	public void open()
	{
		door.open();
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
