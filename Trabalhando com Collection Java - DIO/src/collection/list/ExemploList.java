package collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		System.out.println("Crie uma lista e adicione 7 notas: ");
		
		List<Double> notas = new ArrayList<>();
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		
		System.out.println(notas.toString());
		
//		Exibe a posi��o do elemento na lista.
		System.out.println("Exiba a posi��o da nota 5.0: Posi��o " + notas.indexOf(5d)); 
//		Adiciona o elemento na posi��o desejada.
		System.out.println("Adicione na lista a nota 8.0 na posi��o 4: ");
		notas.add(4, 8d);
		System.out.println(notas);
//		Para substituir um elemento na lista.
		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		notas.set(notas.indexOf(5d), 6.0);
		System.out.println(notas);
//		Confere se o elemento est� na lista.
		System.out.println("Confira se a nota 5.0 est� na lista: " + notas.contains(5d));
//		Exibir os elementos na ordem que foram informados.
		System.out.println("Exiba todas as notas na ordem que foram informados: ");
		for (Double nota : notas) System.out.println(nota);
//		Para passar a posi��o e exibir o elemento.
		System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		System.out.println(notas.toString());
//		Exibi o menor elemnto da lista.
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
//		Exibe o maior elemento.
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
//		Faz a itera��o dos elementos dentro da lista
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while (iterator.hasNext()){
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Exiba a soma dos valores: " + soma);
//		Exibe a m�dia dos elementos
		System.out.println("Exiba a m�dia das notas: " + (soma/notas.size()));
//		Para remover o elemeto.
		System.out.println("Remova a nota 0.0: ");
		notas.remove(0d);
		System.out.println(notas);
//		Para remover o elemento da posi��o.
		System.out.println("Remova a nota da posi��o 0: ");
		notas.remove(0);
		System.out.println(notas);
//		Para remover elementos menores que o usu�rio escolhe
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator2 = notas.iterator();
		while(iterator2.hasNext()) {
			Double next = iterator2.next();
			if(next < 7 ) iterator2.remove(); 
		}
		System.out.println(notas);
//		Para apagar a lista.
		System.out.println("Apague toda a lista: ");
		notas.clear();
		System.out.println(notas);
//		Para conferir se a lista est� vazia
		System.out.println("Confira se a lista est� vazia: " + notas.isEmpty());
	}

}
