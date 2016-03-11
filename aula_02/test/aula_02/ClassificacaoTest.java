package aula_02;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ClassificacaoTest {
	
	@Test
	public void testAddEquipe() throws Exception {
		
		Classificacao classificao = new Classificacao();
		
		Equipe e1 = new Equipe("The Strongest", RandomPoint());
		Equipe e2 = new Equipe("River Plate", RandomPoint());
		Equipe e3 = new Equipe("São Paulo", RandomPoint());
		Equipe e4 = new Equipe("Trujillanos", RandomPoint());

		Equipe e5 = new Equipe("River Plate-URU", RandomPoint());
		Equipe e6 = new Equipe("Nacional-URU", RandomPoint());
		Equipe e7 = new Equipe("Palmeiras", RandomPoint());
		Equipe e8 = new Equipe("Rosario Central", RandomPoint());

		Equipe e9 = new Equipe("Racing", RandomPoint());
		Equipe e10 = new Equipe("Boca Juniors", RandomPoint());
		Equipe e11 = new Equipe("Deportivo Cali", RandomPoint());
		Equipe e12 = new Equipe("Bolívar", RandomPoint());

		Equipe e13 = new Equipe("Atlético Nacional", RandomPoint());
		Equipe e14 = new Equipe("Huracán", RandomPoint());
		Equipe e15 = new Equipe("Peñarol", RandomPoint());
		Equipe e16 = new Equipe("Sporting Cristal", RandomPoint());

		Equipe e17 = new Equipe("Atlético-MG", RandomPoint());
		Equipe e18 = new Equipe("Colo-Colo", RandomPoint());
		Equipe e19 = new Equipe("Independiente del Valle", RandomPoint());
		Equipe e20 = new Equipe("Melgar", RandomPoint());
		
		classificao.addEquipe(e1);
		classificao.addEquipe(e2);
		classificao.addEquipe(e3);
		classificao.addEquipe(e4);
		classificao.addEquipe(e5);
		classificao.addEquipe(e6);
		classificao.addEquipe(e7);
		classificao.addEquipe(e8);
		classificao.addEquipe(e9);
		classificao.addEquipe(e10);
		classificao.addEquipe(e11);
		classificao.addEquipe(e12);
		classificao.addEquipe(e13);
		classificao.addEquipe(e14);
		classificao.addEquipe(e15);
		classificao.addEquipe(e16);
		classificao.addEquipe(e17);
		classificao.addEquipe(e18);
		classificao.addEquipe(e19);
		classificao.addEquipe(e20);
		
		Assert.assertEquals(e1, classificao.getEquipe(0));
		Assert.assertSame(e2, classificao.getEquipe(1));
		Assert.assertSame(e3, classificao.getEquipe(2));
		Assert.assertSame(e4, classificao.getEquipe(3));
		Assert.assertSame(e5, classificao.getEquipe(4));
		Assert.assertSame(e6, classificao.getEquipe(5));
		Assert.assertSame(e7, classificao.getEquipe(6));
		Assert.assertSame(e8, classificao.getEquipe(7));
		Assert.assertSame(e9, classificao.getEquipe(8));
		Assert.assertSame(e10, classificao.getEquipe(9));
		Assert.assertSame(e11, classificao.getEquipe(10));
		Assert.assertSame(e12, classificao.getEquipe(11));
		Assert.assertSame(e13, classificao.getEquipe(12));
		Assert.assertSame(e14, classificao.getEquipe(13));
		Assert.assertSame(e15, classificao.getEquipe(14));
		Assert.assertSame(e16, classificao.getEquipe(15));
		Assert.assertSame(e17, classificao.getEquipe(16));
		Assert.assertSame(e18, classificao.getEquipe(17));
		Assert.assertSame(e19, classificao.getEquipe(18));
		Assert.assertSame(e20, classificao.getEquipe(19));
		
		//Não pode estar em branco
		assertFalse(classificao.isEmpty());
		
		//Buscar equipe na primeira posição
		//Equipe e = classificao.getEquipe(0);
		
		Assert.assertEquals(classificao.getSize(), 20);
		
		Assert.assertTrue(classificao.contem("Deportivo Cali"));
		Assert.assertFalse(classificao.contem("Time qualquer"));
		
		//Verificar se removeu a equipe na posição 18
		classificao.removerEquipe(18);
		Assert.assertFalse(classificao.contem(e19.getNome()));
		
		//Verificar se conseguiu remover a equipe 20.
		//classificao.removerEquipe(e20);
		//Assert.assertFalse(classificao.contem(e20.getNome()));
			
	}

	/*
	@Test
	public void testRemoveEquipe() {
		fail("Not yet implemented");
	}
	*/
	
	private int RandomPoint(){
		int randomNumber = (int)(Math.random() * 99);
		return randomNumber;
	}
	
}
