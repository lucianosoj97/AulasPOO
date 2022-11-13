package entities;

public class PessoaJ extends Dados{
	
	private Double qtdFuncionarios;

	public PessoaJ(String nome, Double rendaAnual, Double gastoTotal) {
		super(nome, rendaAnual);
		this.qtdFuncionarios = gastoTotal;
	}

	public Double getGastoTotal() {
		return qtdFuncionarios;
	}

	public void setGastoTotal(Double gastoTotal) {
		this.qtdFuncionarios = gastoTotal;
	}

	@Override
	public Double taxa() {
		if (qtdFuncionarios > 10) {
			return getRendaAnual() * 0.14;
		}
		else {
			return getRendaAnual() * 0.16;
		}
	}

}
