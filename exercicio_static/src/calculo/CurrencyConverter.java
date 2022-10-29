package calculo;

public class CurrencyConverter {
	
	public static double price;
	public static double quantity;

	
	public static double conversor() {
		return price * quantity;
	}
	
	public static double porcentagem() {
		return quantity * 6 / 100;
	}
	
	public static double amont() {
		return porcentagem();
	}
	
	
	
}