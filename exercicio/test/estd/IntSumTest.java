package estd;

import org.junit.Assert;
import org.junit.Test;

public class IntSumTest {
	
	@Test
	public void intSumTest(){
		
		//Definir um número para realizar o teste
		IntSum num = new IntSum(10);

		//Definir aqui o valor equivalente à soma dos numeros inteiros menores que o informado anteriormente. (Excel para validar também)
		int sumEq = 45;
		
		//Retornar a soma dos números inteiros menores que.
		int sum = num.getSum();
		
		//Verificar se a soma é equivalente ao informado.
		Assert.assertEquals(sum, sumEq);

		
		//Testar com o número 20
		num.setNumber(20);
		sumEq = 190;
		sum = num.getSum();
		Assert.assertEquals(sum, sumEq);
		
		
		//Testar com o número 30
		num.setNumber(30);
		sumEq = 435;
		sum = num.getSum();
		Assert.assertEquals(sum, sumEq);
		
		
		//Testar com o número 1
		num.setNumber(1);
		sumEq = 0;
		sum = num.getSum();
		Assert.assertEquals(sum, sumEq);
	}
}