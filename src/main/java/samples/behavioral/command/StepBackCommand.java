package samples.behavioral.command;

public class StepBackCommand implements Command
{
	public void execute()
	{
		System.out.print('\b');
	}

	public void redo()
	{
		System.out.print('\b');
	}

	public void undo()
	{
		System.out.print('.');
	}
}
