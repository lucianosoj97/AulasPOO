package entities;

public class ImportProduct extends Product {
	
	private Double customsFree;
	
	public ImportProduct() {
		super();
	}

	public ImportProduct(String name, Double price, Double customsFree) {
		super(name, price);
		this.customsFree = customsFree;
	}

	public Double getCustomsFree() {
		return customsFree;
	}

	public void setCustomsFree(Double customsFree) {
		this.customsFree = customsFree;
	}
	
	public Double totalPrice() {
		return getPrice() + customsFree;
	}
	
	@Override
	public String Pricetag() {
		return getName() + " $ "
				+ String.format("%.2f", totalPrice())
				+"(Customs fee: $ "
				+ String.format("%.2f", customsFree)
				+ ")";
	}
	
}
