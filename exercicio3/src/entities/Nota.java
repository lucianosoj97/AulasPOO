package entities;

public class Nota {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double mediaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double passouOuNao() {
		if (mediaFinal() < 60){
			return 60.0 - mediaFinal();
		}
		else {
			return 0.0;
		}
	}
}
