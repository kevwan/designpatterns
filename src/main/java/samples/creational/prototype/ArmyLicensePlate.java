package samples.creational.prototype;

public class ArmyLicensePlate implements LicensePlate
{
	public LicensePlate makeCopy()
	{
		return new ArmyLicensePlate();
	}
}
