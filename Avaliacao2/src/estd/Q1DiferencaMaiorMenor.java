package estd;

/**
 *	1. Dado um array de inteiros n[ ] com no m�nimo dois itens, retorne a diferen�a entre o maior e o menor entre eles.
 *	Exemplo: {5,8,9,2} -> 7 (diferen�a entre maior (9) e menor (2) )
 *
 * @author gilmar.goulart
 */
public class Q1DiferencaMaiorMenor {
	
	private int[] numeros;
	
	public Q1DiferencaMaiorMenor(int[] numeros){
		this.numeros = numeros;
	}
	
	public int getDiferencaMaiorMenor(){
		
		//Inicializar o maior como sendo zero.
		int maior = 0;
		
		//Considerar o menor como sendo o n�mero da primeira posi��o.
		int menor = numeros[0];
		
		for (int i : numeros) {
			//Verificar o maior n�mero.
			if (i > maior) {
				maior = i;
			}
			
			//Verificar o menor numero
			if (i < menor) {
				menor = i;
			}
		}
		
		//Calcular a diferen�a entre o maior e menor numero
		int difereca = maior - menor;
		
		//Retornar a diferen�a
		return difereca;
	}
}