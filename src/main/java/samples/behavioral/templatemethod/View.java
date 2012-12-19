package samples.behavioral.templatemethod;

public abstract class View
{
	public void show()
	{
		beforeShow();
		doShow();
		afterShow();
	}

	protected void afterShow()
	{
	}

	protected void beforeShow()
	{
	}

	protected void doShow()
	{
		System.out.println("Showing the view.");
	}
}
