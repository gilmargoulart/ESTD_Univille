package bolha;

import java.util.Arrays;
import java.util.Random;
import org.junit.Test;

public class BolhaTest {
	
	@Test
	public void bolhaTest(){
		
		int tamanho = 10000;
		
		int[] n = new int[tamanho];
		
		for (int i = 0; i < tamanho-1; i++) {
			n[i] = new Random().nextInt(10000);
		}
		
		/*
		int[] n = {8, 5, 42, 1, 3, 7};
		int[] nOrdenadoAsc = {1, 3, 5, 7, 8, 42};
		int[] nOrdenadoDesc = {42, 8, 7, 5, 3, 1};
		*/
		
		//Antes da ordenação...
		System.out.println(Arrays.toString(n));
		
		long start = System.currentTimeMillis();
		
		Bolha b = new Bolha(n);
		b.orderAsc();
		
		long finish = System.currentTimeMillis();
		
		
		System.out.println("Tempo: " + (finish - start));
		
		//Verificar se ordenou de forma ascendente...
		//Assert.assertArrayEquals(nOrdenadoAsc, b.orderAsc());
		//
		//Assert.assertEquals(n.length, nOrdenadoAsc.length);
		
		//Após ordenação
		System.out.println(Arrays.toString(b.getN()));
		
		start = System.currentTimeMillis();
		
		b = new Bolha(n);
		
		//Verificar se ordenou de forma descendente...
		//Assert.assertArrayEquals(nOrdenadoDesc, b.orderDesc());
		//
		//Assert.assertEquals(n.length, nOrdenadoDesc.length);
		
		b.orderDesc();
		
		finish = System.currentTimeMillis();
		System.out.println("Tempo: " + (finish - start));
		
		//Após ordenação
		System.out.println(Arrays.toString(n));
	}
}