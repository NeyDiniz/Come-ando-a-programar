package collection.list;

import java.text.CollationElementIterator;

/*Dadas as seguintes informações sobre seus gatos, crie uma Lista e ordene essa Lista exibindo: 
 *(nome - idade - cor); 
 * 
 * Gato 1 = nome: Jan, idade: 18, cor: preto
 * Gato 2 = nome: Simba, idade: 6, cor: tigardo
 * Gato 3 = nome: Jan, idade: 10, cor: amarelo
 * */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
	public static void main(String[] args) {
		
		List<Gato> meusGatos = new ArrayList<>(){{
			String nome;
			int idade;
			String cor;
			add(new Gato(nome = "Jan", idade = 18, cor = "preto"));
			add(new Gato(nome = "Simba", idade = 6, cor = "tigrado"));
			add(new Gato(nome = "Jan", idade = 10, cor = "amarelo"));
		}};
		System.out.println("--\tOrdem de Inserção\t--");
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem de Aleatória\t--");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem de Natural (Nome)\t--");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem de Idade\t--");
//		Collections.sort(meusGatos, new ComparatorIdade());
		meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem de Cor\t--");
//		Collections.sort(meusGatos, new ComparatorCor());
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem/Cor/Idade\t--");
//		Collections.sort(meusGatos, new ComparatorNomeCorIdade());
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);



	}

}

class Gato implements Comparable<Gato>{
	private String nome;
	private Integer idade;
	private String cor;
	
	
	
	public Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
		
		
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}

	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
}

class ComparatorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}

class ComparatorCor implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
	
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if (nome != 0) return nome;
		
		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if (cor != 0) return cor;
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
		
		
		
	}
}