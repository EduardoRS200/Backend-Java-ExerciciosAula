package br.com.stefanini.orientacaoaobjetos;

public class Carro {

	/*
	 * Modificadores de acesso
	 * default = sem palavra chave, Acessível na própria classe ou classe de um mesmo pacote
	 * public = acessível na própria classe, classe mesmo pacote, subclasse(extends), todas demais classes
	 * private = acessível na propria classe
	 * protected = acessível na própria classe, classe mesmo pacote e subclasse(extends)
	*/

	private String marca;
	private String modelo;
	private int velocidadeMaxima;
	private int taxaAceleracao;
	private double quilometrosPorLitros;

	public Carro() {
		System.out.println("Contruindo Carro...");
	}
	
	// Sobrecagar de construtores, com assinaturas diferentes 	

	public Carro(String marca, String modelo) {
	 	this.marca = marca;
		this.modelo = modelo;	
	}


	public void acelerar () {
		System.out.println("Acelerando..");
	}
			
	public void frear() {
		System.out.println("Freando..");
	}

	public double calcularTaxaAceleracao(double velocidadeFinal, double velocidadeInicial, double tempoFinal, double tempoInicial) {
		return (velocidadeFinal - velocidadeInicial) / (tempoFinal - tempoInicial) * 3.6; 
	}

	// Criando a sobrecagar no metodo calcularTaxaAceleracao

	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		return (velocidadeFinal - 0) / (tempoFinal - 0) * 3.6; 
	}

	public String calcularTaxaAceleracao(int velocidadeFinal, int tempoFinal) {
		return "" + (velocidadeFinal - 0) / (tempoFinal - 0) * 3.6; 
	}

	
	public String getMarca() {
		return this.marca;
        }

	public void setMarca (String marca){
		this.marca = marca;
	}


	public String getModelo() {
		return this.modelo;
        }

	public void setModelo (String modelo){
		this.modelo = modelo;

		}
		
	public int getVelocidadeMaxima() {
		return this.velocidadeMaxima;
        }

	public void setVelocidadeMaxima (int velocidadeMaxima){
		if(velocidadeMaxima < 0) {
			System.out.println("Valor inválido");
		} else{
		this.velocidadeMaxima = velocidadeMaxima;

		}

	}

	public int getTaxaAceleracao() {
		return this.taxaAceleracao;
        }

	public void setTaxaAceleracao (int taxaAceleracao){
		this.taxaAceleracao = taxaAceleracao;
	}

	public double getQuilometrosPorLitros() {
		return this.quilometrosPorLitros;
        }

	public void setQuilometrosPorLitros (double quilometrosPorLitros){
		this.quilometrosPorLitros = quilometrosPorLitros;
	}




}
