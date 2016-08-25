package br.univille.prova;

public class Q4RetornaSoma {
	
	public long retornaSoma(Stack<Integer> stack){
		
		long soma = 0;
		
		//Enquanto pilha não estiver vazia...
		while(!stack.isEmpty()){
			//Somar e remover o elemento da pilha
			soma += stack.pop();
		}
		
		return soma;
	}
}