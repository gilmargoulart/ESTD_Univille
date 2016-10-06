package compareSort;

import java.util.Arrays;
import java.util.Random;
import org.junit.Test;
import bolha.Bolha;
import merge.MergeSort;

public class CompareTest {

	@Test
	public void compare() {
		int tamanhoVetor = 100000;
		int valorMax = 100000;
		
		//Criar vetor aleatorio
		int[] i = getVetorRandom(tamanhoVetor, valorMax);
		Bolha bolha = new Bolha(i);
		
		//Marcar tempo
		long currTimeBooble = System.currentTimeMillis();
		//System.out.println(Arrays.toString(i));
		//Ordenar
		bolha.orderAsc();
		//System.out.println(Arrays.toString(i));
		//Marcar tempo
		long afterTimeBooble = System.currentTimeMillis();
		long execTimeBooble = afterTimeBooble - currTimeBooble;
		System.out.println("BoobleSort Execution Time: " + execTimeBooble + "ms, " + (execTimeBooble/1000.0) + "s");
		
		//Criar vetor aleatório
		int[] i2 = getVetorRandom(tamanhoVetor, valorMax);
		MergeSort merge = new MergeSort(i2);
		
		//Marcar tempo
		long currTimeMerge = System.currentTimeMillis();
		//System.out.println(Arrays.toString(i2));
		//Ordenar
		merge.sort();
		//System.out.println(Arrays.toString(i2));
		//Marcar tempo
		long afterTimeMerge = System.currentTimeMillis();
		long execTimeMerge = afterTimeMerge - currTimeMerge;
		System.out.println("MergeSort Execution Time: " + execTimeMerge + "ms, " + (execTimeMerge/1000.0) + "s");
		
		
		
		
		
		
		//Criar vetor aleatório
		int[] i3 = getVetorRandom(tamanhoVetor, valorMax);
		
		//Marcar tempo
		long currTimeArraySort = System.currentTimeMillis();
		//System.out.println(Arrays.toString(i2));
		//Ordenar
		Arrays.sort(i3);
		//System.out.println(Arrays.toString(i2));
		//Marcar tempo
		long afterTimeArraySort = System.currentTimeMillis();
		long execTimeArraySort = afterTimeArraySort - currTimeArraySort;
		System.out.println("Arrays.sort() Execution Time: " + execTimeArraySort + "ms, " + (execTimeArraySort/1000.0) + "s");
		
		
		
		//Criar vetor aleatório
		int[] i4 = getVetorRandom(tamanhoVetor, valorMax);
		
		//Marcar tempo
		long currTimeArrayParallelSort = System.currentTimeMillis();
		//System.out.println(Arrays.toString(i2));
		//Ordenar
		Arrays.parallelSort(i4);
		//System.out.println(Arrays.toString(i2));
		//Marcar tempo
		long afterTimeParallelSort = System.currentTimeMillis();
		long execTimeParallelSort = afterTimeParallelSort - currTimeArrayParallelSort;
		System.out.println("Arrays.parallelSort() Execution Time: " + execTimeParallelSort + "ms, " + (execTimeParallelSort/1000.0) + "s");
					
	}
	
	private int[] getVetorRandom(int tamanho, int valorMax){
		int[] i = new int[tamanho];
		
		//Preencher vetor com valores aleatórios
		Random r = new Random();
		for (int j = 0; j < i.length; j++) {
			i[j] = r.nextInt(valorMax);
		}
		
		return i;
	}

}
