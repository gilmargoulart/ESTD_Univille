package br.univille.expressionValidator;

import br.univille.stack.Stack;

public class ExpressionValidator {
	
	/**
	 * Expressão
	 */
	private char[] expression;
	
	/**
	 * Método construtor
	 * @param expression
	 */
	public ExpressionValidator(String expression){
		setExpression(expression.toCharArray());
	}
	
	/**
	 * Verifica se a expressão é válida
	 * @return boolean
	 */
	public boolean testExpression(){
		
		Stack<Character> stack = new Stack<>();
		
		//Pra cada char da expressão...
		for (char c : expression) {
			//Verificar se é um caracter de abertura
			if (isOpenChar(c)) {
				//Adicionar na pilha
				stack.push(c);
			} else if (isCloseChar(c)) {
				//Verificar se o caractere de abertura é o equivalente ao de fechamento
				if (!isMatch(stack.pop(), c)) {
					return false;
				}
			}
		}
		
		//Caso o stack esteja vazio, então a expressão é válida, pois não sobrou caracteres para validação.
		return stack.isEmpty();
	}
	
	/**
	 * Indica se é um caracter de abertura.
	 * @param c
	 * @return
	 */
	private boolean isOpenChar(Character c){
		//Retorna true se for algum char entre: ( ou [ ou {
		return ("([{".contains(c.toString()));
	}
	
	/**
	 * Indica se é um caracter de fechamento.
	 * @param c
	 * @return
	 */
	private boolean isCloseChar(Character c){
		//Retorna true se for algum char entre: ) ou ] ou }
		return (")]}".contains(c.toString()));
	}
	
	/**
	 * Indica se o char1 de abertura é o equivalente ao char2 de fechamento.
	 * @param char1 - abertura
	 * @param char2 - fechamento
	 * @return
	 */
	public boolean isMatch(char c1, char c2){
		return
				((c1 == '(' && c2 == ')')
				|| (c1 == '[' && c2 == ']')
				|| (c1 == '{' && c2 == '}'));
	}
	
	/**
	 * Retorna a expressão
	 * @return
	 */
	public char[] getExpression() {
		return expression;
	}	
	
	private void setExpression(char[] expression) {
		this.expression = expression;
	}
}
