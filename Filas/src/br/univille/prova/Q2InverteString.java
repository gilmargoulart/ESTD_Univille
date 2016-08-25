package br.univille.prova;

public class Q2InverteString {
	
	public String inverterString(String s){
		String strRet = "";
		
		//Array de chars
		char[] chars = s.toCharArray();
		
		//Pilha de chars
		Stack<Character> pilha = new Stack<>();
		
		//Adicionar cada caractere na pilha
		for (char c : chars) {
			//Adicionar...
			pilha.push(c);
		}
		
		//Adicionar cada caractere na pilha, de forma que a String inicial fique invertida
		while(pilha.getSize() > 0){
			strRet += pilha.pop();
		}
		
		return strRet;
	}
}