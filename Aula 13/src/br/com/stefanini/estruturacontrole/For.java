package br.com.stefanini.estruturacontrole;

public class For {

	public static void main(String[] args) {
		
				// for normal
				for (int i = 0; i < 10; i++) {
				     System.out.println(i);
				}
				
				for (int i = 0, j = 10; i < 10; i++, j--) {
				     System.out.println("i" + i);
				     System.out.println("j" + j);	
				}

				// for apenas com a condi?ao

				int i = 0;

				for (; i < 10; ) {
				    System.out.println(i);
				    i++;
				}
				
				// for loop infinito

				//for (;;) {
				 //    System.out.println("Loop infinito");
				//}
				
	}

}
