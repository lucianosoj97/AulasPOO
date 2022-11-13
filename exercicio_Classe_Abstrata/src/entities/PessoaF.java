package entities;

public class PessoaF extends Dados {

	private Double gastoTotal;

	public PessoaF(String nome, Double rendaAnual, Double gastoTotal) {
		super(nome, rendaAnual);
		this.gastoTotal = gastoTotal;
	}

	public Double getGastoTotal() {
		return gastoTotal;
	}

	public void setGastoTotal(Double gastoTotal) {
		this.gastoTotal = gastoTotal;
	}

	@Override
	public Double taxa() {
		if (getRendaAnual() <  20000.00) {
			return getRendaAnual() * 0.15 - gastoTotal * 0.5;
		}
		else {
			return getRendaAnual() * 0.25 - gastoTotal * 0.5;
		}
	}
	
	
	
	

}
