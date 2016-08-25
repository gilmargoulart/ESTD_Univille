package br.univille.prova;

import java.util.ArrayList;
import java.util.List;

public class Q1RetornaDuasFilas {
	
	public Q1RetornaDuasFilas(){
		//Construtor
	}
	
	public List<Queue<Integer>> getQueues(int[] numeros){
		//Lista contendo as duas listas de n�meros pares e �mpares
		List<Queue<Integer>> listaRetorno = new ArrayList<>();
		
		//Tamanho da lista
		int tamanhoLista = numeros.length;
		
		//Lista 1 - N�meros pares
		Queue<Integer> f1 = new Queue<>(tamanhoLista);
		//Lista 2 - N�meros �mpares
		Queue<Integer> f2 = new Queue<>(tamanhoLista);
		
		for (int i = 0; i < tamanhoLista; i++) {
			//Verificar se � n�mero par.
			if (numeros[i] % 2 == 0) {
				f1.enqueue(numeros[i]);
			} else {
				f2.enqueue(numeros[i]);
			}
		}
		
		//Adicionar � lista os n�meros pares
		listaRetorno.add(f1);
		
		//Adicionar � lista os n�meros �mpares
		listaRetorno.add(f2);
		
		return listaRetorno;
	}
}