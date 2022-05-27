package com.stefanini.cursojavabasico.vetores;

public class Vetores {

	public static void main(String[] args) {
		
        int[] nota = new int[10];
		
		nota[0] = 1;
		nota[2] = 5;
		nota[6] = 9;
		nota[4] = 2;
		nota[1] = 4;
		nota[9] = 7;
		nota[7] = 8;

		/*System.out.println(notas[0]);
		System.out.println(notas[2]);
		System.out.println(notas[6]);
		System.out.println(notas[4]);
		System.out.println(notas[1]);
		System.out.println(notas[9]);
		System.out.println(notas[7]);*/
		
		String[] carros = new String[] {"BMW i320", "Mercedes c180", "BMW M3", "Mercedes AMG", "Tesla Model S"};		

		System.out.println(carros.length);
		
		for (String carro : carros){
	             System.out.println(carro);
		}

		/*for (int i = 0; i < notas.length; i++){
		System.out.println(notas[]);

		} */

	}

}
