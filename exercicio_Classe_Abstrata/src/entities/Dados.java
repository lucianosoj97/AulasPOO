package entities;

public abstract class Dados {

		private String nome;
		private Double rendaAnual;
		
		public Dados(String nome, Double rendaAnual) {
			super();
			this.nome = nome;
			this.rendaAnual = rendaAnual;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Double getRendaAnual() {
			return rendaAnual;
		}

		public void setRendaAnual(Double rendaAnual) {
			this.rendaAnual = rendaAnual;
		}
		
		public abstract Double taxa();
		
	}

