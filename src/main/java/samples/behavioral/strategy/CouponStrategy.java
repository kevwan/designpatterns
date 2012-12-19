package samples.behavioral.strategy;

public class CouponStrategy implements PromoteStrategy
{
	public void buy(String product)
	{
		System.out.println("You'll get a coupon!");
	}
}
