package br.com.stefanini.cursojavabasico.lambdaestream;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

public class LambdaStream {

	static int gerarIdade(int min, int max) {
		return new SplittableRandom().nextInt(min, max);
	}

	public static void main(String[] args) {
		
		//Lista para trabalhar com Colector	
		List<String> nomes = Arrays.asList("Alice", "J?o", "Maria", "Pedro", "Raquel", "Samuel");
		System.out.println("Lista de nomes:");
		nomes.forEach((n) -> System.out.println(n));
	
		System.out.println("Lista de Pessoas:");
		List<Pessoa> pessoas = nomes.stream().map((n) -> new Pessoa(n,gerarIdade(15, 30))).collect(Collectors.toList());
		pessoas.forEach((p) -> System.out.println(p.getNome() + ": " + p.getIdade()));
	
		System.out.println("Lista de Pessoas Miores de Idade:");
		List<Pessoa> pessoasMaioresDeIdade = pessoas.stream().filter((p) -> p.getIdade() >= 18).collect(Collectors.toList());
		pessoasMaioresDeIdade.forEach((p) -> System.out.println(p.getNome() + ": " + p.getIdade()));
		
		System.out.println("Lista de Pessoas Odernada:");
		List<Pessoa> pessoasOrdenadas = pessoasMaioresDeIdade.stream().sorted((p1, p2) -> p2.getIdade() - p1.getIdade()).collect(Collectors.toList());
		pessoasOrdenadas.forEach((p) -> System.out.println(p.getNome() + ": " + p.getIdade()));

		// reduce acumula valores 
		System.out.println("Soma das Idades:");
		Integer totalIdade = pessoasOrdenadas.stream().map(p -> p.getIdade()).reduce(0, (somaIdade, idade) -> somaIdade += idade);
		System.out.println("Total:" + totalIdade);


	}  
}
