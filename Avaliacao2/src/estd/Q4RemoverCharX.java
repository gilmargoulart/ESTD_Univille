package estd;

/**
 * 4. Dada uma String s, retorne uma outra String retirando todos os caracteres "x" que estivessem presentes na primeira.
 * Exemplo: "oxamana" -> "oamana"
 * Exemplo: "xxrrfvxx" -> "rrfv"
 * 
 * @author gilmar.goulart
 */
public class Q4RemoverCharX {
	
	private String palavra;
	private char charReplace = 'x';
	
	public Q4RemoverCharX(String palavra){
		this.palavra = palavra;
	}
	
	public String removerCharX(){
		
		/*
			strRetorno = this.palavra.replace("x", "");
			strRetorno = this.palavra.replace("X", "");
		*/
		
		String strRetorno = "";
		for (char c : this.palavra.toCharArray()) {
			//Verificar se a letra não é correspondende a charReplace
			if (Character.toLowerCase(c) != charReplace) {
				//Se não for correspondente a charReplace, adicionar à String de retorno
				strRetorno += c;
			}
		}
		
		//Retornar String sem caracter correspondente ao charReplace
		return strRetorno;
	}
}