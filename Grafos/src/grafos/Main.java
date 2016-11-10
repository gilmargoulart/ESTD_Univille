package grafos;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int linhas = 6;
		int colunas = 6;
		int[][] m = {
				{0, 1, 1, 0, 0, 0},
				{0, 0, 0, 1, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{0, 0, 1, 0, 0, 0},
				{0, 0, 0, 1, 0, 1},
				{0, 0, 0, 0, 0, 1},
			};
		
		fechaTransit(m, m.length);
		
		//System.out.println(Arrays.deepToString(m));
		for (int i = 0; i <  linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.printf("%5d", m[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static void fechaTransit(int[][] grafo, int dimensao){
		int fecha[][] = grafo.clone();
		for(int k=0;k<dimensao;k++){
			for(int i=0;i<dimensao;i++){
				if(fecha[i][k] != 0){
					for(int j=0;j<dimensao;j++){
						fecha[i][j] = (fecha[i][j]==1) || (fecha[k][j]==1)?1:0;
					}
				}
			}
		}
	    System.out.println("Fechamento Transitivo Warshall");
		for(int i=0;i<dimensao;i++){
			for(int j=0;j<dimensao;j++){
				System.out.print(fecha[i][j] + " ");
			}
			System.out.println();
		}
	}

}
