package models;

public class No {
	private char valor;
	private No esquerdo;
	private No direito;
	
	public No(char valor) {
		super();
		this.valor = valor;
		this.esquerdo = null;
		this.direito = null;
	}
	public char getValor() {
		return valor;
	}
	public void setValor(char valor) {
		this.valor = valor;
	}
	public No getEsquerdo() {
		return esquerdo;
	}
	public void setEsquerdo(No esquerdo) {
		this.esquerdo = esquerdo;
	}
	public No getDireito() {
		return direito;
	}
	public void setDireito(No direito) {
		this.direito = direito;
	}
	
	
	
}
