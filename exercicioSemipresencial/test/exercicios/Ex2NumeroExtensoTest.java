package exercicios;
import org.junit.Assert;
import org.junit.Test;

import exercicios.Ex2NumeroExtenso;

public class Ex2NumeroExtensoTest {
	
	@Test
	public void testeNumeroExtenso(){
		
		//para arranjo {3,7,1} o algoritmo deve retornar {"tr�s", "sete", "um"}
		
		//Ajustar os n�meros para testar
		int[] numeros = {3, 7, 1};
		//Ajustar array de String conforme os numeros acima
		String[] numerosExtensoEsperado = { "tr�s", "sete", "um" };
		
		Ex2NumeroExtenso num = new Ex2NumeroExtenso(numeros); 
		
		//Retornar os n�meros por extenso
		String[] numerosExtenso = num.getNumeroExtenso();
		
		//Verificar se o retorno � o mesmo que o esperado
		Assert.assertArrayEquals(numerosExtensoEsperado, numerosExtenso);
	}
}