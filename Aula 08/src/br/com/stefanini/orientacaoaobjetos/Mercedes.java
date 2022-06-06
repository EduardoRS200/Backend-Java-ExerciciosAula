package br.com.stefanini.orientacaoaobjetos;

public class Mercedes extends Carro {

	public Mercedes(){
		this.setMarca("Mercedes");
	}

	@Override
	public String acelerar(){
		return "A Mercendes tem uma acelereção diferente para cada modelo";
	}
}
