package prova;

public class Q4SomaNumerosImpares {
	private Stack<Integer> stackNumeros;

	
	public Q4SomaNumerosImpares(Stack<Integer> numeros){
		setN(numeros);
	}
	
	/**
	 * Retorna soma apenas de números ímpares
	 * @return somaImpares
	 */
	public int getSomaImpares(){
		int somaImpares = 0;
		
		int num = 0;
		//Navegar na pilha enquanto tamanho maior que zero
		while (stackNumeros.getSize() > 0) {
			num = stackNumeros.pop();
			
			//Verificar se o resto da divisão de num por 2 é diferente de zero
			if (num % 2 != 0) {
				//Ímpar
				//Somar...
				somaImpares += num;
			}
		}
		
		return somaImpares;
	}
	
	private void setN(Stack<Integer> n) {
		this.stackNumeros = n;
	}
	
}
