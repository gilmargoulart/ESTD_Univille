package exercicios;

import org.junit.Assert;
import org.junit.Test;

public class Ex3NumeroFaltanteTeste {
	
	@Test
	public void testeNumeroFaltante(){
		/*
			dado {5,6,9,4,1,2,8,3,0} – deve retornar: 7
			dado {2,0,4,5,6,7,8,9,3} – deve retornar: 1
			dado {1,3,2,6,5,7,8,0,9} – deve retornar: 4
		 */
		
		int[] numeros = {5, 6, 9, 4, 1, 2, 8, 3, 0};
		int esperado = 7;
		Ex3NumeroFaltante numFaltante = new Ex3NumeroFaltante(numeros);
		
		Assert.assertEquals(esperado, numFaltante.getNumeroFaltante());
		
		//
		int[] numeros2 = {2, 0, 4, 5, 6, 7, 8, 9, 3};
		esperado = 1;
		numFaltante = new Ex3NumeroFaltante(numeros2);
		Assert.assertEquals(esperado, numFaltante.getNumeroFaltante());
		
		//
		int[] numeros3 = {1, 3, 2, 6, 5, 7, 8, 0, 9};
		esperado = 4;
		numFaltante = new Ex3NumeroFaltante(numeros3);
		Assert.assertEquals(esperado, numFaltante.getNumeroFaltante());
	}
}