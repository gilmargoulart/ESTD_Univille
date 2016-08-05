package br.univille.notacaoPolonesa;

import br.univille.stack.Stack;

public class PolishNotation {
	
	/**
	 * Express�o
	 */
	private String expression;
	
	/**
	 * M�todo construtor
	 * @param expression
	 */
	public PolishNotation(String expression){
		setExpression(expression);
	}
	
	/**
	 * Retorna resultado da express�o polonesa
	 * @return String
	 */
	public String process(){
		
		Stack<String> stack = new Stack<>();
		
		for (Character c : expression.toCharArray()) {
			//Verificar se � um operando
			if (isOperand(c)) {
				//Empilhar
			} else if (isOperator(c)) {
				//Buscar dois �ltimos elementos da pilha e aplicar o operador
				
				//Empilhar o resultado
			}
		}
		
		//Retorna o �ltimo elemento da pilha, que ao final estar� com o resultado.
		return stack.pop();
	}
	
	/**
	 * Indica se � um num�rico
	 * @param c
	 * @return
	 */
	private boolean isOperand(Character c){
		//Retorna true se for num�rico
		return ("0123456789".contains(c.toString()));
	}
	
	/**
	 * Indica se � um caracter de operador
	 * @param c
	 * @return
	 */
	private boolean isOperator(Character c){
		//Retorna true se for algum char entre: ) ou ] ou }
		return ("+-*/".contains(c.toString()));
	}
	
	/**
	 * Retorna a express�o
	 * @return
	 */
	public String getExpression() {
		return expression;
	}	
	
	private void setExpression(String expression) {
		this.expression = expression;
	}
}
