package samples.behavioral.state;

import java.io.IOException;
import java.io.InputStreamReader;

public class Client
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader is = new InputStreamReader(System.in);
		Button button = new Button();
		while (true)
		{
			System.out.println("Press enter: ");
			is.read();
			is.read();
			button.push();
		}
	}
}
