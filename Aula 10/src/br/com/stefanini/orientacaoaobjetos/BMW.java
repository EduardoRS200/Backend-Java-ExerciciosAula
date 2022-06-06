package br.com.stefanini.orientacaoaobjetos;

public class BMW extends Carro {

	
	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("Sobrescrita do metodo...");
		return (velocidadeFinal / tempoFinal); 
	}

}