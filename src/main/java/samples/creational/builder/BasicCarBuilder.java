package samples.creational.builder;

public class BasicCarBuilder extends CarBuilder
{
	@Override
	public void buildChassis()
	{
		car.setChassis(new BasicChassis());
	}

	@Override
	public void buildDoor()
	{
		car.setDoor(new BasicDoor());
	}
}
