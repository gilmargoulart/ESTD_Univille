package aula_02;

public class Classificacao {
	
	private Equipe equipes[];
	private int qtdEquipes = 20;
	
	public Classificacao(){
		equipes = new Equipe[qtdEquipes];
	}
	
	
	/**
	 * Retorna todas as equipes da Classificacao.
	 * @return Array Equipe
	 */
	public Equipe[] getEquipes() {
		return equipes;
	}
	
	
	/**
	 * Adiciona equipe na primeira posição disponível.
	 * @param equipe
	 * @throws Exception
	 */
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
	
	
	/**
	 * Retornar equipe na posição especificada.
	 * @param i
	 * @return
	 */
	public Equipe getEquipe(int i){
		return equipes[i];
	}
	
	
	/**
	 * Remover determinada equipe.
	 * @param equipe
	 */
	public void removerEquipe(Equipe equipe) {
		//TODO Implementar lógica para remover equipe
		for (Equipe e : equipes) {
			if (!(e == null)){
				if (e.equals(equipe)) {
					e = null;
					break;
				}
			}
		}		
	}
	
	
	/**
	 * Remover equipe por posição.
	 * @param i
	 */
	public void removerEquipe(int i) {
		equipes[i] = null;
	}
	
	
	/**
	 * Retorna se o array de times está branco, ou seja, se ao menos há 1 time.
	 * @return
	 */
	public boolean isEmpty(){ 
		for (Equipe e : equipes) {
			if (!(e == null)){
				return false;
			}
		}
		return true;
	}
	
	
	/**
	 * Retorna número de equipes que estão na Classificacao
	 * @return
	 */
	public int getSize(){
		int size = 0;
		
		for (Equipe e : equipes) {
			if (!(e == null)){
				size++;
			}
		}
		return size;
	}
	
	
	/**
	 * Verifica se contem o time informado
	 * @param name
	 * @return
	 */
	public boolean contem(String name) {
		for (Equipe e : equipes) {
			if (!(e == null)){
				if (e.getNome().contains(name)) {
					return true;
				}
			}
		}
		return false;
	}
}