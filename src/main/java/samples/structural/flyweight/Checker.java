package samples.structural.flyweight;

public class Checker
{
	private final String name;
	private final int age;

	public Checker(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public int getAge()
	{
		return age;
	}

	public String getName()
	{
		return name;
	}
}
