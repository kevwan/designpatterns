package samples.behavioral.nullobject;

public class Client
{
	public static void main(String[] args)
	{
		String message = "hello world!";
		print(new RealOutputStream(), message);
		print(new NullOutputStream(), message);
	}

	private static void print(OutputStream stream, String message)
	{
		stream.write(message);
	}
}
