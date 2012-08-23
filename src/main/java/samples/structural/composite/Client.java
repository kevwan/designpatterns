package samples.structural.composite;

public class Client
{
	public static void main(String[] args)
	{
		Directory dir = new Directory();
		dir.add(new File());
		Directory dir1 = new Directory();
		dir1.add(new File());
		dir.add(dir1);
		dir.ls();
	}
}
