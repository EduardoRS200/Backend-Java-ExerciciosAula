package br.com.stefanini.operadores;

public class OperadoresAtribuição {

	public static void main(String[] args) {
	
		int a = 10; // operador de atribuição
		int b = 5;

		b += a; //aditivo
		b -= a; //subtrativo
		b *= a; //multiplicativo
		b /= a; //diviso
		b %= a ; //modular 

		System.out.println(a % b); // pega o resto da divisão

	}

}
