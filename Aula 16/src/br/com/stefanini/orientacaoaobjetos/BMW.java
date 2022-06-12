package br.com.stefanini.orientacaoaobjetos;

public class BMW extends Carro implements Conversivel, Utilitario {

	public BMW() {
		super();
	}
	
	
	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("BMW sobrescrita do metodo...");
		return (velocidadeFinal / tempoFinal); 
	}
	
	@Override
	public void piscarAlerta() {
	        System.out.println("BMW piscar alerta....");
	}
	
	@Override
	public void acionarTurbo() {
	        
	}

	@Override
	public void passear() {
	        
	}


	@Override
	public void abrirCapo() {
		
		
	}
	

}

