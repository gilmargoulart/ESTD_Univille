package prova;

public class Q3RetornaStringOrdemAlfabetica {
	
	private String string;
	
	public Q3RetornaStringOrdemAlfabetica(String s){
		setString(s);
	}
	
	/**
	 * Retorna String com caracteres em ordem alfabética
	 * @return
	 */
	public String getStringOrdemAlfabetica(){
		String stringRetorno = "";
		
		char[] chars = this.string.toCharArray();
		
		//Chars temporários, para utilizar o método compareTo() da classe Character. 
		Character chari;
		Character charj;
		
		for (int i = 0; i < chars.length - 1; i++) {
			for (int j = i+1; j < chars.length; j++) {
				chari = chars[i];
				charj = chars[j];

				//Verificar se o char na posição do i é maior que o char na posição do j
				if (chari.compareTo(charj) > 0) {
					//Inverter os valores
					
					//Char na posição de i recebe o char na posição de j
					chars[i] = charj;
					
					//Char na posição de j recebe o char na posição de i
					chars[j] = chari;
				}
			}
		}
		
		//Atribui todos os caracteres novamente à String de retorno.
		stringRetorno = String.valueOf(chars);
		
		//Retorna String em ordem alfabética
		return stringRetorno;
	}
	
	private void setString(String string) {
		this.string = string;
	}
}
