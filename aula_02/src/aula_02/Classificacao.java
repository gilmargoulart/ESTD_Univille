package aula_02;

public class Classificacao {
	
	private Equipe equipes[];
	private int qtdEquipes = 20;
	
	public Classificacao(){
		equipes = new Equipe[qtdEquipes];
	}
	
	public Equipe[] getEquipes() {
		return equipes;
	}
	
	public void addEquipe(Equipe equipe) throws Exception {
		
		boolean inseriu = false; 
		
		for (int i = 0; i < equipes.length; i++) {
			if(equipes[i] == null){
				equipes[i] = equipe;
				inseriu = true;
				break;
			}
		}
		
		if(!inseriu){
			throw new Exception("Não há espaço para inserir equipe.");
		}
	}
	
	public void removerEquipe(Equipe equipe) {
		//TODO Implementar lógica para remover equipe
	}
	
	public void removerEquipe(int i) {
		//TODO Implementar lógica para remover equipe
		equipes[i] = null;
	}
	
			
}