package estd;

/**
 * 2. Dado um array de inteiros n[ ], retorne verdadeiro se o mesmo contiver a sequência "22", caso contrário retorne falso.
 * Exemplo: {3,5,6,2,2,5} -> true
 * Exemplo: {3,4,6,2,5,7} -> false
 * 
 * @author gilmar.goulart
 */
public class Q2Sequencia22 {
	
	private int numeroSoma = 22;
	private int[] numeros;
	
	public Q2Sequencia22(int[] numeros){
		this.numeros = numeros;
	}
	
	public boolean hasSequencia22(){
		
		int soma = 0;
		//Soma numeros do array de inteiros
		for (int i : numeros) {
			soma += i;
			if (soma > numeroSoma) {
				//Sair caso a soma já tenha ultrapassado do numero estipulado
				break;
			}
		}
		
		//Retornar o resultado da condição
		return (soma == numeroSoma);
	}
}