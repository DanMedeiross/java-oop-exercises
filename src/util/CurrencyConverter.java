package util;

public class CurrencyConverter {
	public static double dollarPrice;
	public static double dollarQuantity;
	public static final double IOF = 0.06;
	
	public static double converter() {
		double price = dollarPrice * dollarQuantity;
		price += price * IOF;
		return price;
	}
}
