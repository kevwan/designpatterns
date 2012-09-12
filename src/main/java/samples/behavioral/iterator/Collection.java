package samples.behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection
{
	public class Itr implements Iterator<String>
	{
		private int cursor = 0;

		public boolean hasNext()
		{
			return cursor < names.length;
		}

		public String next()
		{
			return names[cursor++];
		}

		public void remove()
		{
			List<String> list = new ArrayList<String>(Arrays.asList(names));
			list.remove(--cursor);
			names = list.toArray(new String[0]);
		}
	}

	private String[] names = { "aaa", "bbb", "ccc", "ddd" };

	public Iterator<String> iterator()
	{
		return new Itr();
	}
}
