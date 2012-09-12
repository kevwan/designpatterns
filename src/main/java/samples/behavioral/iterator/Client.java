package samples.behavioral.iterator;

import java.util.Iterator;

public class Client
{
	public static void main(String[] args)
	{
		Collection c = new Collection();
		Iterator<String> it = c.iterator();
		while (it.hasNext())
		{
			String next = it.next();
			if (next.equals("bbb"))
			{
				it.remove();
				continue;
			}
			System.out.println(next);
		}
	}
}
