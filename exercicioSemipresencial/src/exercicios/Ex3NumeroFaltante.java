package exercicios;

/**
	3. Desenvolver um algoritmo que, dado um arranjo de 9 n�meros inteiros (de 0 a 9) n�o repetidos e em ordem aleat�ria, retorne o n�mero faltante.
	 
	Exemplos:
	 
	dado {5,6,9,4,1,2,8,3,0} � deve retornar: 7
	dado {2,0,4,5,6,7,8,9,3} � deve retornar: 1
	dado {1,3,2,6,5,7,8,0,9} � deve retornar: 4
 */
public class Ex3NumeroFaltante {
	
	private int[] numeros;
	private int[] numerosFixos = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	public Ex3NumeroFaltante(int[] numeros){
		this.numeros = numeros;
	}
	
	public int getNumeroFaltante(){
		
		int numFaltante = 0;
		
		//Somar os numeros "fixos"
		for (int n : numerosFixos) {
			numFaltante += n;
		}
		
		//Subtrair a soma de todos os numeros que vieram por parametro
		for (int n : numeros) {
			numFaltante -= n;
		}		
		
		//O restante � o n�mero faltante
		return numFaltante;
	}
	
}
