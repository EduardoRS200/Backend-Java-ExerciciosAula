package br.com.stefanini.estruturacontrole;

public class IfElse {

	public static void main(String[] args) {
		int nota = 7;
		
		// if
		
		if (nota >= 7) {
		    System.out.println("Aprovado");		
		}

		// if sem bloco  

		if (nota  >= 7)
		    System.out.println("Aprovado");	
		
		// if else

		if (nota  >= 7) {
		    System.out.println("Aprovado");		
		} else {
	            System.out.println("Reprovado ");
		}

		// if else if
		if (nota  >= 9) {
		    System.out.println("Aprovado");
		    System.out.println("Parabéns");	
		} else if (nota >= 7) {
	            System.out.println("Reprovado ");
		} else {
	            System.out.println("Reprovado ");
		}


	}

}
