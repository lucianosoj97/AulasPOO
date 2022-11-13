package entities;

public class OutsourcedEmployee extends Employee {

	private Double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double addiotionCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = addiotionCharge;
	}

	public Double getAddiotionCharge() {
		return additionalCharge;
	}

	public void setAddiotionCharge(Double addiotionCharge) {
		this.additionalCharge = addiotionCharge;
	}
	
	//A parte de baixo esta pegando o calculo do pagamento de employee e somando com additionalCharge e somando os 110% do enunciado.
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
	
	
}
