package binaria;

import bolha.Bolha;

public class PesquisaBinaria {
	
	private int[] numeros;
			
	public PesquisaBinaria(int[] n){
		//Ordenar
		setNumeros(new Bolha(n).orderAsc());
	}
	
	/**
	 * 
	 * @return n
	 */
	public boolean find(int procurado){
		
		boolean retorno = false;
		
		//1º - Dividir array no "meio"
		int meio = 0;
		int superior = numeros.length - 1;
		int inferior = 0;
		
		int n = 0;
		
		while (inferior <= superior) {
			//Dividir o array no meio
			meio = (inferior + superior) / 2;
			
			n = numeros[meio];
			
			//Verificar se é o número a ser pesquisado
			if(n == procurado){
				//Encontrou
				retorno = true;
				break;
			} else if(procurado > n) {
				//Procurar na metade superior
				inferior = meio + 1;
			} else if(procurado < n){
				//Procurar na metade inferior
				superior = meio - 1;
			}
		}
		
		return retorno;
	}
	
	private void setNumeros(int[] n){
		this.numeros = n;
	}
}