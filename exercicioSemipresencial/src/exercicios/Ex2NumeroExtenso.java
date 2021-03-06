package exercicios;

/**
 *
	2. Crie um algoritmo que, dado um arranjo de inteiros, retorne um arranjo de strings, onde cada string ser� representa��o lingu�stica do n�mero.
 
	Obs: ser�o considerados apenas os n�meros de 0 a 9!
	 
	Exemplo:
	 
	para arranjo {3,7,1} o algoritmo deve retornar {"tr�s", "sete", "um"}
 */
public class Ex2NumeroExtenso {
	
	
	private int[] numeros;
	
	public Ex2NumeroExtenso(int[] numeros){
		this.numeros = numeros;
	}
	
	/**
	 * 
	 * @return
	 */
	public String[] getNumeroExtenso(){
		
		String[] strNumeros = { "zero", "um", "dois", "tr�s", "quatro", "cinco", "seis", "sete", "oito", "nove"};
		String strRetorno[] = new String[numeros.length];
		
		int i = 0;
		for (int num : this.numeros) {
			strRetorno[i] = strNumeros[num];
			i++;
		}
		
		return strRetorno;
	}
}