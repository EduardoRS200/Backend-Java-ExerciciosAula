package br.com.stefanini.orientacaoaobjetos.entidade;

import br.com.stefanini.orientacaoaobjetos.Carro;

public class BMW extends Carro {

	public BMW(){
		this.setMarca("BMW");

	}

	// Sobrescrevendo um metodo 
	
	@Override
	public String acelerar(){
		return "A BMW pode fazer 0 a " + this.getVelocidade() + "em 5s";
	}



}
