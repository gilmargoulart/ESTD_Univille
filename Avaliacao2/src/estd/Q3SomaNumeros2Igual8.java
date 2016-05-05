package estd;

/**
 * 3.	Dado um array de inteiros n[ ], retorne verdadeiro se a soma de
 * todos os números "2" contidos nele for igual a 8. Caso contrário retorne falso.
 * 
 * @author gilmar.goulart
 */
public class Q3SomaNumeros2Igual8 {
	
	//Indica o numero que devera resultar da soma de todos os numeros 2 contidos no array.
	private int numeroSoma = 8;
	
	//Indica o numero para condicionar na soma
	private int numeroCondicaoSoma = 2;
	
	private int[] numeros;
	
	public Q3SomaNumeros2Igual8(int[] numeros){
		this.numeros = numeros;
	}
	
	public boolean isSomaNumero2Igual8(){
		
		int somaNum2 = 0;
		for (int i : numeros) {
			//Verificar se o numero é o estipulado (2)
			if (i == numeroCondicaoSoma) {
				//Somar... 
				somaNum2 += i;
			}
		}
		
		//Retornar resultado da condição que verifica se a soma é o resultado esperado.
		return (somaNum2 == numeroSoma);
	}
}