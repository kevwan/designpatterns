package samples.creational.objectpool;

public class WorkshopPool extends Pool<CarWorkshop>
{
	private static class WorkshopPoolHolder
	{
		private static final WorkshopPool INSTANCE = new WorkshopPool();
	}

	public static WorkshopPool get()
	{
		return WorkshopPoolHolder.INSTANCE;
	}

	private WorkshopPool()
	{
	}

	@Override
	protected CarWorkshop create()
	{
		return new CarWorkshop();
	}
}
