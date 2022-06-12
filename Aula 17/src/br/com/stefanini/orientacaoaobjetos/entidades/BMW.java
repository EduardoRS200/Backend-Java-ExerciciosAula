package br.com.stefanini.orientacaoaobjetos.entidades;

import br.com.stefanini.orientacaoaobjetos.Carro;

public class BMW extends Carro {

	public BMW() {
		super();
	}
	
	
	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("BMW sobrescrita do metodo...");
		return (velocidadeFinal / tempoFinal); 
	}
	

}

