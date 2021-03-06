package exercicios;

import java.util.Arrays;

/**
 *
	1. Um anagrama � um jogo lingu�stico que consiste em formar palavras novas pela transposi��o de letras de outras. Por exemplo, gato � anagrama de toga.
	Crie um algoritmo que, dadas duas Strings, verifique se uma � anagrama da outra.
	 
	Exemplos:
	 
	(Roma, Amor) -> TRUE (as strings s�o anagramas)
	(Roma, Casa) -> FALSE (as strings n�o s�o anagramas)
 */
public class Ex1Anagrama {

	
	
	private String strCompare1;
	private String strCompare2;
	
	/**
	 * 
	 * @param strCompare1
	 * @param strCompare2
	 */
	public Ex1Anagrama(String strCompare1, String strCompare2){
		this.strCompare1 = strCompare1;
		this.strCompare2 = strCompare2;
	}

	
	/**
	 * Verifica se as duas Strings s�o anagramas
	 * @return boolean
	 */
	public boolean isAnagrama(){
		
		char[] charsStrCompare1 = this.strCompare1.toLowerCase().toCharArray();
		char[] charsStrCompare2 = this.strCompare2.toLowerCase().toCharArray();
		
		Arrays.sort(charsStrCompare1);
		Arrays.sort(charsStrCompare2);
		
		//Retorna o resultado da compara��o entre s dois arrays
		return Arrays.equals(charsStrCompare1, charsStrCompare2);
	}
}
