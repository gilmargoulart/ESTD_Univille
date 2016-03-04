package aula_02;

public class MainProgram {
	
	/*
	int x; //Tipo de dados inteiro "primitivo"
	Integer y; //Tipo de dados Integer -> Classe
	
	int[] xs; //Array
	Integer[] ys; //Array
	*/
	
	public static void main(String[] args) {
		Classificacao classificao = new Classificacao();
		
		try {
			
			classificao.addEquipe(new Equipe("The Strongest", RandomPoint()));
			classificao.addEquipe(new Equipe("River Plate", RandomPoint()));
			classificao.addEquipe(new Equipe("S�o Paulo", RandomPoint()));
			classificao.addEquipe(new Equipe("Trujillanos", RandomPoint()));
			
			classificao.addEquipe(new Equipe("River Plate-URU", RandomPoint()));
			classificao.addEquipe(new Equipe("Nacional-URU", RandomPoint()));
			classificao.addEquipe(new Equipe("Palmeiras", RandomPoint()));
			classificao.addEquipe(new Equipe("Rosario Central", RandomPoint()));
			
			classificao.addEquipe(new Equipe("Racing", RandomPoint()));
			classificao.addEquipe(new Equipe("Boca Juniors", RandomPoint()));
			classificao.addEquipe(new Equipe("Deportivo Cali", RandomPoint()));
			classificao.addEquipe(new Equipe("Bol�var", RandomPoint()));
			
			classificao.addEquipe(new Equipe("Atl�tico Nacional", RandomPoint()));
			classificao.addEquipe(new Equipe("Hurac�n", RandomPoint()));
			classificao.addEquipe(new Equipe("Pe�arol", RandomPoint()));
			classificao.addEquipe(new Equipe("Sporting Cristal", RandomPoint()));
			
			classificao.addEquipe(new Equipe("Atl�tico-MG", RandomPoint()));
			classificao.addEquipe(new Equipe("Colo-Colo", RandomPoint()));
			classificao.addEquipe(new Equipe("Independiente del Valle", RandomPoint()));
			classificao.addEquipe(new Equipe("Melgar", RandomPoint()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		classificao.removerEquipe(2);
		
	}
	
	private static int RandomPoint(){
		int randomNumber = (int)(Math.random() * 99);
		return randomNumber;
	}
}