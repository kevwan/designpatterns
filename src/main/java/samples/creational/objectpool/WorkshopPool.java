package samples.creational.objectpool;

public class WorkshopPool extends Pool<CarWorkshop>
{
	@Override
	protected CarWorkshop create()
	{
		return new CarWorkshop();
	}
}
