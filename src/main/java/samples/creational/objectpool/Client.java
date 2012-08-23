package samples.creational.objectpool;

public class Client
{
	public static void main(String[] args)
	{
		WorkshopPool pool = WorkshopPool.get();
		pool.setMaxSize(2);
		buildCar(pool);
		buildCar(pool);
		buildCar(pool);
	}

	private static void buildCar(WorkshopPool pool)
	{
		if (pool.hasMore())
		{
			CarWorkshop workshop = pool.acquire();
			try
			{
				workshop.buildCar();
			}
			finally
			{
				pool.release(workshop);
			}
		}
	}
}
