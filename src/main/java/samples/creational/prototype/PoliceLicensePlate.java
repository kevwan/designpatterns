package samples.creational.prototype;

public class PoliceLicensePlate implements LicensePlate
{
	public LicensePlate makeCopy()
	{
		return new PoliceLicensePlate();
	}
}
