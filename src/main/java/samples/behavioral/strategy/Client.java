package samples.behavioral.strategy;

public class Client
{
	public static void main(String[] args)
	{
		Promotion promotion1 = new Promotion(new CouponStrategy());
		promotion1.buy("123flashchat");

		Promotion promotion2 = new Promotion(new BuyOneGetOneStrategy());
		promotion2.buy("123flashchat");

		Promotion promotion3 = new Promotion(new DiscountStrategy());
		promotion3.buy("123flashchat");
	}
}
