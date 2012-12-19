package samples.behavioral.templatemethod;

public class PopupView extends View
{
	@Override
	protected void afterShow()
	{
		System.out.println("Wrapping up the show.");
	}

	@Override
	protected void beforeShow()
	{
		System.out.println("Preparing the show.");
	}
}
