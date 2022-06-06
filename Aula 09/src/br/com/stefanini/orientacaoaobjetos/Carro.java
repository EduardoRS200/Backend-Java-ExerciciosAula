package br.com.stefanini.orientacaoaobjetos;

public class Carro {

	String marca;
	String modelo;
	int velocidadeMaxima;
	int taxaAceleracao;
	double quilometrosPorLitro;

	void acelerar () {
		System.out.println("Acelerando..");
	}
			
	void frear() {
		System.out.println("Freando..");
	}


}
