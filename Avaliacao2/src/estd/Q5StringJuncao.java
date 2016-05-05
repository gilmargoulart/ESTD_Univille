package estd;

/**
 * 5. Dadas duas Strings s1 e s2, retorne uma nova String s3 contendo a junção das duas separadas por um espaço.
 * Usar apenas recursos de arranjos, não usar concatenação nativa das Strings assim como nenhum método utilitário da classe String do Java!
 * Exemplo {"ola", "pedro"} -> "ola pedro"
 * 
 * @author gilmar.goulart
 */
public class Q5StringJuncao {
	
	private String string1;
	private String string2;
	
	public Q5StringJuncao(String str1, String str2){
		this.string1 = str1;
		this.string2 = str2;
	}
	
	public String getJuncaoString(){
		
		//String strJuncao = "";
		
		//Define o tamano do charArray
		int charlength = this.string1.length() + this.string2.length() + 1;
		//Novo charArray com o tamanho das duas Strings, mais 1 para o espaço da junção.
		char[] charsJuncao = new char[charlength];
		
		//Index para o charArray
		int i = 0;
		
		//Adicionar os caracteres da string1 ao charArray		
		for (char c : string1.toCharArray()) {
			//strJuncao += c;
			charsJuncao[i] = c;
			i++;
		}
		
		if (this.string2.length() > 0) {
			//strJuncao += " ";
			charsJuncao[i] = ' ';
			i++;
		}
		
		//Adicionar os caracteres da string2 ao charArray
		for (char c : string2.toCharArray()) {
			//strJuncao += c;
			charsJuncao[i] = c;
			i++;
		}
		
		String strJuncao = "";
		//strJuncao = String.valueOf(charsJuncao);
		
		//Atribui todos os chars do charArray para String
		for (char c : charsJuncao) {
			strJuncao += c;
		}
		
		//Retorna String com junção.
		return strJuncao;
	}
}