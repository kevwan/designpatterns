package samples.behavioral.command;

public class StepForwardCommand implements Command
{
	public void execute()
	{
		System.out.print('.');
	}

	public void redo()
	{
		System.out.print('.');
	}

	public void undo()
	{
		System.out.print('\b');
	}
}
