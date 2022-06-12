package br.com.stefanini.orientacaoaobjetos;

public class Tesla extends Carro {

	private boolean dirigeSozinho;

	public Tesla() {
		super();
	}

	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("Tesla, sobrescrita do metodo...");
		return (velocidadeFinal * tempoFinal);
	}

	public boolean isDirigeSozinho() {
		return dirigeSozinho;
	}

	public void setDirigeSozinho(boolean dirigeSozinho) {
		this.dirigeSozinho = dirigeSozinho;
	}

	@Override
	public void piscarAlerta() {
		System.out.println("Tesla piscar alerta....");
	}

}