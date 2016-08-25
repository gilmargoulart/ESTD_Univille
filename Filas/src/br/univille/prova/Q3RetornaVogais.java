package br.univille.prova;

public class Q3RetornaVogais {
	
	public Queue<Character> retornarVogais(Queue<Character> queue){
		
		//Fila para retorno
		Queue<Character> vogais = new Queue<>(queue.size());
		
		//Para cada caractere...
		while(queue.size() > 0){
			//Remover char da fila...
			char v = queue.dequeue();
			//Verificar se é uma vogal...
			if(v == 'a' || v == 'A'
				|| v == 'e' || v == 'E'
				 || v == 'i' || v == 'I'
				 || v == 'o' || v == 'O'
				 || v == 'u' || v == 'U'){
				//Adicionar na fila de vogais
				vogais.enqueue(v);
			}
		}
		
		return vogais;
	}
}