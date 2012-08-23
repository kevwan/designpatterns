package samples.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Factory
{
	private static Map<String, LicensePlate> prototypes = new HashMap<String, LicensePlate>();

	static
	{
		prototypes.put("army", new ArmyLicensePlate());
		prototypes.put("police", new PoliceLicensePlate());
	}

	public static LicensePlate makeLicensePlate(String type)
	{
		LicensePlate prototype = prototypes.get(type);
		if (prototype != null)
		{
			return prototype.makeCopy();
		}
		throw new IllegalArgumentException();
	}
}
