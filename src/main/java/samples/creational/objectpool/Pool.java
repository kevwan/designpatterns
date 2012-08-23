package samples.creational.objectpool;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Pool<T>
{
	private final Queue<T> pool = new LinkedList<T>();
	private int maxSize = 0;
	private int count = 0;

	public T acquire()
	{
		if (hasMore())
		{
			if (pool.isEmpty())
			{
				return createWithCounting();
			}
			return pool.poll();
		}
		throw new IllegalStateException();
	}

	public boolean hasMore()
	{
		return maxSize == 0 || count < maxSize;
	}

	public void release(T reusable)
	{
		pool.add(reusable);
	}

	public void setMaxSize(int size)
	{
		this.maxSize  = size;
	}

	protected abstract T create();

	private T createWithCounting()
	{
		++count;
		return create();
	}
}
