package samples.creational.builder;

public class LuxuryCarBuilder extends CarBuilder
{
	@Override
	public void buildChassis()
	{
		car.setChassis(new LuxuryChassis());
	}

	@Override
	public void buildDoor()
	{
		car.setDoor(new LuxuryDoor());
	}
}
