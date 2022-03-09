package com.NeyDiniz.Estruturadados.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade){
		elementos = new String [capacidade];
		tamanho = 0;
		}


		public boolean adiciona(String elemento) {
			if (tamanho < elementos.length){
				elementos[tamanho] = elemento;
				tamanho++;
				return true;
			}
			return false;
		} 

		public String busca(int posicao){
			if (!(posicao >= 0 && posicao < tamanho)){
				throw new IllegalArgumentException("Posição Inválida");
			}
			return elementos[posicao];
		}

		public int tamanho(){
			return this.tamanho;
		}

		public String toString(){
			StringBuilder s = new StringBuilder();
			s.append("[");

			for (int i=0; i<this.tamanho-1; i++){
				s.append(elementos[i]);
				s.append(", ");
			}

			if (this.tamanho>0){
				s.append(elementos[this.tamanho-1]);
			}
			s.append("]");

			return s.toString();
		}
}
