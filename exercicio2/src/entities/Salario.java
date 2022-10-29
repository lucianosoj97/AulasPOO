package entities;

public class Salario {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double liquidSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return "Employee: " + name + ", $ " + String.format("%.2f", liquidSalary());
	}

}
