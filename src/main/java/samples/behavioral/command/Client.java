package samples.behavioral.command;

public class Client
{
	public static void main(String[] args)
	{
		CommandManager manager = new CommandHistoryManager();
		Command c1 = new StepForwardCommand();
		c1.execute();
		manager.storeCommand(c1);
		Command c2 = new StepForwardCommand();
		c2.execute();
		manager.storeCommand(c2);
		manager.undoCommand();
		manager.redoCommand();
	}
}
