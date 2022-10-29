package entities;

public class Banco {

	private int number;
	private String holder;
	private double balance;
	
	public Banco(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Banco(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNunber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void whithdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + balance;
	}
	
}
