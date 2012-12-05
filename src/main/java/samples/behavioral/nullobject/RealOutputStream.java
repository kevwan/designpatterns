package samples.behavioral.nullobject;

public class RealOutputStream implements OutputStream
{
	public void write(String s)
	{
		System.out.println(s);
	}
}
