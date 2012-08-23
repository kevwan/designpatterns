package samples.structural.composite;

import java.util.ArrayList;
import java.util.Collection;

public class Directory implements Node
{
	private final Collection<Node> children = new ArrayList<Node>();

	public void add(Node node)
	{
		children.add(node);
	}

	public void ls()
	{
		System.out.println(this.toString());
		for (Node node : children)
		{
			node.ls();
		}
	}
}
