package aula_02;

public class Equipe {
	
	private String nome; //Nome da equipe
	private int pontos; //Pontuação
	
	private int saldoGols;
	private int qtdJogos;
	private int qtdVitorias;
	private int qtdEmpates;
	private int qtdDerrotas;
	
	public Equipe(){
		setNome("");
	}
	
	public Equipe(String nome){
		if(nome == null){
			nome = "";
		}
		setNome(nome);
	}

	public Equipe(String nome, int pontos){
		if(nome == null){
			nome = "";
		}
		setNome(nome);
		setPontos(pontos);
	}
	
	public Equipe(String nome, int pontos, int saldoGols, int qtdJogos, int qtdVitorias, int qtdEmpates, int qtdDerrotas){
		setNome(nome);
		setPontos(pontos);
		setSaldoGols(saldoGols);
		setQtdJogos(qtdJogos);
		setQtdVitorias(qtdVitorias);
		setQtdEmpates(qtdEmpates);
		setQtdDerrotas(qtdDerrotas);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	
	public int getSaldoGols() {
		return saldoGols;
	}
	public void setSaldoGols(int saldoGols) {
		this.saldoGols = saldoGols;
	}
	public int getQtdJogos() {
		return qtdJogos;
	}
	public void setQtdJogos(int qtdJogos) {
		this.qtdJogos = qtdJogos;
	}
	public int getQtdVitorias() {
		return qtdVitorias;
	}
	public void setQtdVitorias(int qtdVitorias) {
		this.qtdVitorias = qtdVitorias;
	}
	public int getQtdEmpates() {
		return qtdEmpates;
	}
	public void setQtdEmpates(int qtdEmpates) {
		this.qtdEmpates = qtdEmpates;
	}
	public int getQtdDerrotas() {
		return qtdDerrotas;
	}
	public void setQtdDerrotas(int qtdDerrotas) {
		this.qtdDerrotas = qtdDerrotas;
	}
}