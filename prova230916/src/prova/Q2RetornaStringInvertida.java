package prova;

public class Q2RetornaStringInvertida {
	
	private String string;
	private Stack<Character> stack;
	
	public Q2RetornaStringInvertida(String s){
		stack = new Stack<Character>();
		setString(s);
	}
	
	/**
	 * Retorna String invertida, utilizando implementação com uso de filas.
	 * @return String
	 */
	public String retornaStringInvertida(){
		
		String returnString = "";
		
		//Array de chars
		char[] chars = this.string.toCharArray();
		
		//Para cada char da String...
		for (char c : chars) {
			//Adicionar da pilha...
			stack.push(c);
		}
		
		//Desempilhar até tamanho ficar zero...
		while (stack.getSize() > 0) {
			//Adiciona char na sequência da String
			returnString += stack.pop();
		}
		
		//Retorna String invertida
		return returnString;
	}
	
	private void setString(String string) {
		this.string = string;
	}
}
