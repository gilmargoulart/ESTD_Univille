package estd;


/**
 * 1. Crie um algoritmo que imprime um texto de tr�s para frente.
 * (exemplo: ao receber a palavra �texto� o algoritmo deve imprimir �otxet�. Lembre que, em Java, uma String nada mais � do que um array de char (char[ ]).
 * @author gilmar.goulart
 *
 */
public class ReverseString {
	
	private String text;
	
	public ReverseString(String text){
		setText(text);
	}
	
	
	/**
	 * Define o atributo text com o inverso do seu pr�prio valor.
	 */
	public void reverse(){
		
		/* :(
		StringBuilder sb = new StringBuilder(text);
		setText(sb.reverse().toString());
		*/
		
		String s = "";
		
		//Cria um array de char a partir do texto informado.
		char[] charArray = getText().toCharArray();
		
		//Inverte a String adicionando 
		for (char c : charArray) {
			//Atribui cada char sempre in�cio do texto. 
			s = c + s;
		}
		
		/*
		//Inverte a String percorrendo seu conte�do de traz para frente
		for (int i = charArray.length-1; i >= 0; i--) {
			s += charArray[i];
		}
		*/
		
		setText(s);
	}
	

	/**
	 * Retorna o atributo text
	 * @return
	 */
	public String getText() {
		return text;
	}

	
	/**
	 * Define o atributo text.
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
	}
	
}
