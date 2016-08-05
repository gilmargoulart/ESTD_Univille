package br.univille.notacaoPolonesa;

import br.univille.stack.Stack;

public class PolishNotation {
	
	/**
	 * Expressão
	 */
	private String expression;
	
	/**
	 * Método construtor
	 * @param expression
	 */
	public PolishNotation(String expression){
		setExpression(expression);
	}
	
	/**
	 * Retorna resultado da expressão polonesa
	 * @return String
	 */
	public String process(){
		
		Stack<String> stack = new Stack<>();
		
		for (Character c : expression.toCharArray()) {
			//Verificar se é um operando
			if (isOperand(c)) {
				//Empilhar
			} else if (isOperator(c)) {
				//Buscar dois últimos elementos da pilha e aplicar o operador
				
				//Empilhar o resultado
			}
		}
		
		//Retorna o último elemento da pilha, que ao final estará com o resultado.
		return stack.pop();
	}
	
	/**
	 * Indica se é um numérico
	 * @param c
	 * @return
	 */
	private boolean isOperand(Character c){
		//Retorna true se for numérico
		return ("0123456789".contains(c.toString()));
	}
	
	/**
	 * Indica se é um caracter de operador
	 * @param c
	 * @return
	 */
	private boolean isOperator(Character c){
		//Retorna true se for algum char entre: ) ou ] ou }
		return ("+-*/".contains(c.toString()));
	}
	
	/**
	 * Retorna a expressão
	 * @return
	 */
	public String getExpression() {
		return expression;
	}	
	
	private void setExpression(String expression) {
		this.expression = expression;
	}
}
