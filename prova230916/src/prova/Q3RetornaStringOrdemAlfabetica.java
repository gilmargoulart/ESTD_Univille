package prova;

public class Q3RetornaStringOrdemAlfabetica {
	
	private String string;
	
	public Q3RetornaStringOrdemAlfabetica(String s){
		setString(s);
	}
	
	/**
	 * Retorna String com caracteres em ordem alfab�tica
	 * @return
	 */
	public String getStringOrdemAlfabetica(){
		String stringRetorno = "";
		
		char[] chars = this.string.toCharArray();
		
		//Chars tempor�rios, para utilizar o m�todo compareTo() da classe Character. 
		Character chari;
		Character charj;
		
		for (int i = 0; i < chars.length - 1; i++) {
			for (int j = i+1; j < chars.length; j++) {
				chari = chars[i];
				charj = chars[j];

				//Verificar se o char na posi��o do i � maior que o char na posi��o do j
				if (chari.compareTo(charj) > 0) {
					//Inverter os valores
					
					//Char na posi��o de i recebe o char na posi��o de j
					chars[i] = charj;
					
					//Char na posi��o de j recebe o char na posi��o de i
					chars[j] = chari;
				}
			}
		}
		
		//Atribui todos os caracteres novamente � String de retorno.
		stringRetorno = String.valueOf(chars);
		
		//Retorna String em ordem alfab�tica
		return stringRetorno;
	}
	
	private void setString(String string) {
		this.string = string;
	}
}
