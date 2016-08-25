package br.univille.prova;

import java.util.ArrayList;
import java.util.List;

public class Q1RetornaDuasFilas {
	
	public Q1RetornaDuasFilas(){
		//Construtor
	}
	
	public List<Queue<Integer>> getQueues(int[] numeros){
		//Lista contendo as duas listas de números pares e ímpares
		List<Queue<Integer>> listaRetorno = new ArrayList<>();
		
		//Tamanho da lista
		int tamanhoLista = numeros.length;
		
		//Lista 1 - Números pares
		Queue<Integer> f1 = new Queue<>(tamanhoLista);
		//Lista 2 - Números ímpares
		Queue<Integer> f2 = new Queue<>(tamanhoLista);
		
		for (int i = 0; i < tamanhoLista; i++) {
			//Verificar se é número par.
			if (numeros[i] % 2 == 0) {
				f1.enqueue(numeros[i]);
			} else {
				f2.enqueue(numeros[i]);
			}
		}
		
		//Adicionar à lista os números pares
		listaRetorno.add(f1);
		
		//Adicionar à lista os números ímpares
		listaRetorno.add(f2);
		
		return listaRetorno;
	}
}