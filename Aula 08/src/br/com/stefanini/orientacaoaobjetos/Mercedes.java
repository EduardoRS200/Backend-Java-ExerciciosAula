package br.com.stefanini.orientacaoaobjetos;

public class Mercedes extends Carro {

	public Mercedes(){
		this.setMarca("Mercedes");
	}

	@Override
	public String acelerar(){
		return "A Mercendes tem uma acelere��o diferente para cada modelo";
	}
}
