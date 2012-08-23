package samples;

public class Singleton
{
	private static class SingletonHolder
	{
		private static final Singleton INSTANCE = new Singleton();
	}

	public static Singleton get()
	{
		return SingletonHolder.INSTANCE;
	}

	private Singleton()
	{
	}
}
